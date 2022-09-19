package com.janwes.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.socket
 * @date 2022/5/5 11:30
 * @description 本类用来表示Socket网络编程案例的客户端
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 1.指定要连接的服务器,需要同时指定服务器的IP & Port
        Socket socket = new Socket(InetAddress.getLocalHost(), 8048);
        System.out.println("===> 客户端启动成功...");
        // 2.给服务端发送数据
        OutputStream os = socket.getOutputStream();
        os.write("i want to shopping...".getBytes());
        os.flush();
        socket.shutdownOutput();
        // 3.读取从服务器端返回的数据
        InputStream is = socket.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        String receiveInfo;
        while ((receiveInfo = bf.readLine()) != null) {
            System.out.println("===> " + receiveInfo);
        }
        // 4.关闭资源
        socket.close();
    }
}
