package fepcommu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 금융권에서 사용하는 B2B 대외계 FEB 통신 예제
public class FEPClient {
    public static void main(String[] args) throws Exception {
        String host = "localhost";
        int port = 12345;

        Socket socket = new Socket(host, port);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("Hello from FEP Client");
        System.out.println("Server response: " + in.readLine());

        socket.close();
    }
}
}
