import java.io.*;
import java.net.*;

public class OnChatClient {

    public static void main (String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 9000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
        writer.write("My name is Polina");
        writer.flush();
        String input = reader.readLine();
        System.out.println(input);

        clientSocket.close();
        writer.close();
        reader.close();
    }

    }

