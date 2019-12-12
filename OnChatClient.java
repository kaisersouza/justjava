import java.io.*;
import java.net.*;
import java.util.Scanner;

public class OnChatClient {

    public static void main (String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 9000);
        DataOutputStream outd = new DataOutputStream(clientSocket.getOutputStream());
        DataInputStream ind = new DataInputStream(clientSocket.getInputStream());
        System.out.println("Server: " + ind.readUTF());
        Scanner sc = new Scanner(System.in);
        String outmessage = sc.nextLine();
        outd.writeUTF(outmessage);
        System.out.println("Me: " + outmessage);
        clientSocket.close();
        outd.close();
        ind.close();
    }

    }

