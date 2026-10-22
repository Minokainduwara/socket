package DS_Lab1;

import java.io.*;
import java.net.*;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        
        // Step 1: Create a server on port 5000

        ServerSocket server = new ServerSocket(5000);

        // Step 2: Wait for a client to connect
        System.out.println("Waiting for a client to connect...");

        Socket socket = server.accept();
        System.out.println("Client connected!");

        // Step 3: Create input and output streams for communication
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );

        // Step 4: Create an Output Stream
        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true
        );

        // Step 5: Recieve a message 
         String message = in.readLine();

        System.out.println("Received message from client: " + message);

        // Step 6: Send a reply back to the client
        out.println("Hello from the server!");

        socket.close();
        server.close();
    }
}
