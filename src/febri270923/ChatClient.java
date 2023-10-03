/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febri270923;
import java.net.*; 
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author sryfe
 */
public class ChatClient {
    public static void main(String args[]) throws Exception { 
        Scanner in = new Scanner (System.in);
        System.out.print("Nama kamu siapa ?: ");
        String user = in.nextLine();
        while(true){
        MulticastSocket chat = new MulticastSocket(1234);
        InetAddress group = InetAddress.getByName("234.5.6.7");
        chat.joinGroup(group);
        String msg = "";
        System.out.println("Type a message for the server:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        msg = user + ":" + br.readLine();
        DatagramPacket data = new DatagramPacket(msg.getBytes(),0, msg.length(), group, 1234);
        chat.send(data);
        chat.close();
        }
    }
}
