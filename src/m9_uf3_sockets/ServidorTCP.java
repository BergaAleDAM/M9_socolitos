package m9_uf3_sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

    static int PORT = 2020;

    public ServidorTCP(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket accept = serverSocket.accept();

            DataOutputStream envioServer = new DataOutputStream(accept.getOutputStream());
            DataInputStream bufferEntradaServidor = new DataInputStream(accept.getInputStream());

            
            int msg = bufferEntradaServidor.readInt();
            int msg2 = bufferEntradaServidor.readInt();
            
            
            System.out.println(msg + msg2);
            
            envioServer.writeBytes(msg + "\n");

            
            envioServer.close();
            bufferEntradaServidor.close();
        }
        
        //serverSocket.close();

    }

    public static void main(String[] args) throws IOException {
        new ServidorTCP(PORT);
    }

}

