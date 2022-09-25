package com.janwes.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.nio
 * @date 2022/9/24 16:56
 * @description
 */
public class NioSelectorServer {

    public static void main(String[] args) throws IOException {
        // 创建NIO ServerSocketChannel
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        // 绑定端口
        serverSocket.socket().bind(new InetSocketAddress(9000));
        // 设置ServerSocketChannel为非阻塞
        serverSocket.configureBlocking(false);

        // 打开Selector（多路复用器）处理Channel，即创建epoll
        Selector selector = Selector.open();
        // 将ServerSocketChannel注册到Selector上，Selector只针对客户端accept连接操作
        SelectionKey selectionKey = serverSocket.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("===> 服务启动成功,等待连接中......");

        while (true) {
            // 阻塞方法  阻塞等待需要处理的事件发生
            selector.select();

            // 获取Selector中注册的全部事件的SelectionKey实例
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();

            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                // 如果注册的事件为OP_ACCEPT(连接)，则进行连接获取和注册
                if (key.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    SocketChannel socketChannel = server.accept();
                    System.out.println("===> 客户端连接成功......");
                    // 设置ServerSocketChannel为非阻塞
                    socketChannel.configureBlocking(false);
                    // 注册读事件OP_READ
                    SelectionKey register = socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (key.isReadable()) {
                    SocketChannel sc = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                    int len = sc.read(byteBuffer);
                    if (len > 0) {
                        System.out.println("接收到数据：" + new String(byteBuffer.array(), "GBK"));
                    } else if (len == -1) {
                        // 关闭连接
                        sc.close();
                        System.out.println("客户端断开连接......");
                    }
                }
                // 从事件集合中删除本次处理的key，防止下次select重复处理
                iterator.remove();
            }
        }
    }
}
