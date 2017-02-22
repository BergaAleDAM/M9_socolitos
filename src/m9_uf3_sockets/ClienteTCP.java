package m9_uf3_sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ClienteTCP {

    static String hostname = "localhost";
    static int port = 2020;
    Socket socket;

    public ClienteTCP() throws IOException {
        this.socket = new Socket(hostname, port);
    }

    public ClienteTCP(String host, int port) throws IOException {
        Socket connectionSocket = new Socket(host, port);

        DataOutputStream envioServer = new DataOutputStream(connectionSocket.getOutputStream());
        BufferedReader bufferEntradaCliente = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

        String primero = null;
        String segundo = null;

        primero = JOptionPane.showInputDialog(null, "Mensaje a enviar", "Mensaje de Cliente", 1);

        segundo = JOptionPane.showInputDialog(null, "Segundo mensaje a enviar", "Mensaje de Cliente", 1);

        
        envioServer.writeInt(Integer.parseInt(primero));
        envioServer.writeInt(Integer.parseInt(segundo));
        //envioServer.writeBytes("Hola \n");

        //El ejercicio 1 es basicamnte lo mismo que este pero en vez de leer le 
        //pasas el mensaje justo como es que está arriba
        String msg = bufferEntradaCliente.readLine();
        String msg2 = bufferEntradaCliente.readLine();
        System.out.println(msg);
        System.out.println(msg2);

        envioServer.close();
        bufferEntradaCliente.close();
        connectionSocket.close();

    }

    public static void main(String[] args) throws IOException {
        ClienteTCP clienteTCP = new ClienteTCP(hostname, port);

    }

}
