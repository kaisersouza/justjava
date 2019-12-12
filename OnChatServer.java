import java.net.*;
import java.io.*;

public class OnChatServer {





    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("Server has started. Waiting for connection");
        int count = 1;



            while (true) {

                Socket clientSocket = serverSocket.accept();
                System.out.println("Client has connected " + (count++));

                OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String name = reader.readLine();
                System.out.println(name);
                String response = ("Ur message length = " + name.length());
                writer.write(response);
                writer.flush();

                writer.close();
                reader.close();


                clientSocket.close();


            }
            //serverSocket.close();


        }


    }



