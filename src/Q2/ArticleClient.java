package Q2;



import java.net.*;
import java.io.*;

public class ArticleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        // Read text input from user
        System.out.print("Enter text: ");
        String text = stdIn.readLine();

        // Send text input to server
        out.println(text);

        // Receive and print result from server
        String result = in.readLine();
        System.out.println("Number of articles: " + result);

        socket.close();
    }
}
