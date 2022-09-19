package com.janwes.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.socket
 * @date 2022/5/5 11:30
 * @description 本类用来表示Socket网络编程案例的服务器端
 */
public class Server {

    public static void main(String[] args) throws Exception {
        // 1.启动服务器,指定端口号为8080,等待客户端的连接
        ServerSocket serverSocket = new ServerSocket(8048);
        System.out.println("===> 服务启动成功...");
        InetAddress inetAddress = serverSocket.getInetAddress();
        // 2.接收客户端的连接请求,并建立数据通信通道
        Socket socket = serverSocket.accept();
        System.out.println("===> 客户端连接: " + inetAddress.getHostAddress() + " 成功...");
        // 3.获取到读取流,接收并读取客户端发来的数据
        InputStream is = socket.getInputStream();
        int hasRead;
        char c;
        StringBuilder b = new StringBuilder();
        while ((hasRead = is.read()) != -1) {
            c = (char) hasRead;
            System.out.print(c);
            b.append(c);
        }
        socket.shutdownInput();
        // 4.给客户端发送数据
        OutputStream os = socket.getOutputStream();
        os.write("welcome you...".getBytes());
        // 5.关闭资源
        os.flush();
        os.close();
        is.close();
        serverSocket.close();
    }
}
