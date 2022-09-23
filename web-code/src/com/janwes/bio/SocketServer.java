package com.janwes.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.bio
 * @date 2022/9/19 15:18
 * @description
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {
        // 1.启动服务器,指定端口号为7500,等待客户端的连接
        ServerSocket serverSocket = new ServerSocket(7500);
        while (true) {
            System.out.println("===> 等待连接......");
            // 阻塞(如果有客户端连接时不阻塞)
            Socket clientSocket = serverSocket.accept();
            System.out.println("===> 客户端连接成功......");
            handler(clientSocket);
        }
    }

    private static void handler(Socket clientSocket) throws IOException {
        byte[] bytes = new byte[1024];
        System.out.println("===> 准备接收客户端数据...");
        // 接收客户端数据，阻塞方法，如果没有数据可读时就阻塞
        int read = clientSocket.getInputStream().read(bytes);
        if (read != -1) {
            System.out.println("===> 接收到客户端的数据：" + new String(bytes, 0, read));
        }

        /*OutputStream os = clientSocket.getOutputStream();
        os.write("welcome you client...".getBytes());
        os.flush();*/
    }
}
