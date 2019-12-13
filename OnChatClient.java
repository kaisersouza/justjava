import java.io.*;
import java.net.*;
import java.util.Scanner;

public class OnChatClient {

    public static void main (String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 9000);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("URMessage: ");
        String response = sc1.nextLine();
        writer.write(response);
        writer.flush();
        System.out.println("Me: " + response);


        writer.close();
        clientSocket.close();
    }

    }

