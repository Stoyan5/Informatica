package connectionlesstest;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
public class Server{
    static final int PORT = 3000;
    static final int TIMEOUT = 5000;
    public static void main(String[] args) throws IOException{
        boolean received = false;
        byte[] buffer = new byte[8];
        DatagramSocket server;
        DatagramPacket frame = new DatagramPacket(buffer, 8);
        try{
            server = new DatagramSocket(PORT);
            System.out.println("Socket opened...");
            server.setSoTimeout(TIMEOUT);
            do{
                do{
                    try{
                        server.receive(frame);
                        received = true;
                    }catch(java.net.SocketTimeoutException e){
                        System.out.println(e.getMessage());
                    }
                }while(!received);                             //InetAddress
                System.out.println("Received something from: " + frame.getAddress().getHostAddress());
                System.out.println("Data: " + Arrays.toString(frame.getData()));
                received = false;
            }while(true);
        }catch(SocketException e){
            System.out.println(e.getMessage());
        }
    }
}