package DS_Lab1;
import java.io.*;
import java.net.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class StudentServer {
    public static void main(String[] args) throws IOException{

        // NEW: Store predefined student information

        Map<String, String[]> students = new HashMap<>();

        students.put("ICT001", new String[]{"Amal", "Distributed Systems"});
        students.put("ICT002", new String[]{"Nimal", "Cloud Systems"});
        students.put("ICT003", new String[]{"Kamal", "Information Systems"});

        // Create a TCP server on PORT 5002
        ServerSocket server = new ServerSocket(5002);
        System.out.println("Server is waiting for a client");

        // Wait for a client connection
        Socket socket = server.accept();

        // Create input and Output Stream
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        PrintWriter out = new PrintWriter(
                socket.getOutputStream(),true
        );

        //Receive the registration number from the client
        String regNo = in.readLine();
        System.out.println("Received the reg number: " + regNo);

        // Check whether the registration Number exists
        if (students.containsKey(regNo)){
            String[] info = students.get(regNo);
            out.println("Name: " + info[0] + ", Course: " + info[1]);

        }else{
            out.println("Student not Found");
        }



    }
}
