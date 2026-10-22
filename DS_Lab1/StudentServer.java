package DS_Lab1;
import java.io.*;
import java.net.ServerSocket;
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



    }
}
