package fepcommu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FEPServer {
    public static void main(String[] args) throws Exception {
        int port = 12345;
        ServerSocket server = new ServerSocket(port);

        System.out.println("FEP Server is listening on port " + port);

        while (true) {

            Socket socket = server.accept();
            System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Client message: " + in.readLine());
            out.println("Hello from FEP Server");

            socket.close();
        }
    }
}