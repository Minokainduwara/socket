package DS_Lab1;

import java.io.*;
import java.net.*;

public class TcpClient {

    public static void main(String[] args) throws IOException{

        // Step 1: Connect to the server on port 5000
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Client Connected to the server!");

        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream())
        );

        PrintWriter out = new PrintWriter(
            socket.getOutputStream(), true
        );
        
        // Read a message from the keyboard 
        BufferedReader keyboard = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // Step 2: Send a message to the server
        System.out.print("Enter a message to send to the server: ");
        String message = keyboard.readLine();
        out.println(message);

        // Step 3: Read the response from the server
        String response = in.readLine();
        System.out.println("Response from the server: " + response);

        socket.close();


    }
    
}
