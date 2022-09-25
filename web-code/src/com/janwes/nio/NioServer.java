package com.janwes.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.nio
 * @date 2022/9/22 16:13
 * @description
 */
public class NioServer {

    private static List<SocketChannel> channels = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 创建NIO ServerSocketChannel
        ServerSocketChannel serverSocket = ServerSocketChannel.open();
        // 绑定端口
        serverSocket.socket().bind(new InetSocketAddress(9000));
        // 设置ServerSocketChannel为非阻塞
        serverSocket.configureBlocking(false);
        System.out.println("===> 服务启动成功,等待连接中......");

        while (true) {
            // 非阻塞模式accept()方法不会阻塞，否则会阻塞
            SocketChannel socketChannel = serverSocket.accept();
            if (socketChannel != null) {
                System.out.println("===> 连接成功......");
                // 设置SocketChannel为非阻塞
                socketChannel.configureBlocking(false);
                // 保存客户端连接到list集合中
                channels.add(socketChannel);
            }

            // 迭代集合  读取数据
            Iterator<SocketChannel> iterator = channels.iterator();
            while (iterator.hasNext()) {
                SocketChannel sc = iterator.next();
                ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                int len = sc.read(byteBuffer);
                if (len > 0) {
                    System.out.println("接收到数据：" + new String(byteBuffer.array(), "GBK"));
                } else if (len == -1) {
                    sc.close();
                    iterator.remove();
                    System.out.println("客户端断开连接......");
                }
            }
        }
    }
}
