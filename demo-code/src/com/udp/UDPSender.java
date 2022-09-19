package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Janwes
 * @version 1.0
 * @package com.udp
 * @date 2021/4/11 23:02
 * @description
 */
public class UDPSender {
    public static void main(String[] args) throws Exception {
        String massage = "你是谁？";
        DatagramPacket datagramPacket = new DatagramPacket(massage.getBytes(), massage.getBytes().length,
                InetAddress.getLocalHost(), 8888);
        DatagramSocket socket = new DatagramSocket(6666);
        socket.send(datagramPacket);
        socket.close();
    }
}
