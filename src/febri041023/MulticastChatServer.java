/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package febri041023;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sryfe
 */
public class MulticastChatServer {
    private static final int server_port = 12345;
    private static final String server_address = "localhost";
    
    public static void main(String[] args){
        BufferedReader in = null;
        try {
            Socket socket = new Socket(server_address, server_port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Connect ke server, silahkan kirim pesan(exit untuk keluar)");
            new PesanServer(socket, in).start();
            String message;
            while(true){
                message = scanner.nextLine();
                out.println(message);
                if(message.equalsIgnoreCase("exit")){
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private static class PesanServer extends Thread{
        Socket socket;
        BufferedReader in;
        String message;
        public PesanServer (Socket socket,BufferedReader in){
            this.socket = socket;
            this.in = in;
        }
        
        @Override
        public void run(){
            try {
                while((message = in.readLine())!=null) {
                    System.out.println(message);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
