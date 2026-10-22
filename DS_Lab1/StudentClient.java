package DS_Lab1;

import java.io.*;
import java.net.*;
public class StudentClient {
    public static void main(String[] args) throws IOException{
        // Connect to the server on port 5002
        Socket socket = new Socket("localhost",5002);

        // Create input and output Stream
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        // Read input from the keyboard

    }
}
