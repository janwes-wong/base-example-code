package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Janwes
 * @version 1.0
 * @package com.udp
 * @date 2021/4/11 23:25
 * @description
 */
public class UDPReceive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        socket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        System.out.println(new String(bytes,0,length));
        socket.close();
    }
}
