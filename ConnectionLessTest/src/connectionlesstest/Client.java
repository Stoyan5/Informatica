package connectionlesstest;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Client{
    static final int PORT = 3000;
    static final int TIMEOUT = 5000;
    public static void main(String[] args){
        byte[] buffer = new byte[8];
        DatagramSocket client;
        DatagramPacket frame = new DatagramPacket(buffer, 8);
        try{
            buffer[0] = 0;
            buffer[1] = 1;
            buffer[2] = 1;
            buffer[3] = 1;
            buffer[4] = 1;
            buffer[5] = 1;
            buffer[6] = 1;
            buffer[7] = 0;
            client = new DatagramSocket();
            client.setSoTimeout(TIMEOUT);
            System.out.println("Socket aperto...");
            try{
                frame.setAddress(InetAddress.getLocalHost());
                System.out.println(frame.getAddress().toString());
                frame.setPort(PORT);
                client.send(frame);
                System.out.println("Sent frmae...");
            }catch(IOException e){
                System.out.println("Transmission error...");
            }
        }catch(SocketException ex){
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}