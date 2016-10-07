package q2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
/**
 * Created by Aluísio on 06/10/2016.
 */
public class Cliente {
    private String query = " ";
    private final Socket socket;

    public Cliente() throws IOException {
        this.socket = new Socket("localhost", 12345);
    }

    public void send(String message) throws IOException {
        String s = message;
        System.out.println("Mensagem do cliente: ");
        socket.getOutputStream().write(s.getBytes());
        socket.getOutputStream().flush();
        System.out.println("socket encerrado!");
    }

    public String receive() throws IOException {
        System.out.println("Cliente mensagem recebida:");
        InputStream input = socket.getInputStream();
        byte[] b = new byte[1024];
        input.read(b);
        return new String(b).trim();
    }
}
