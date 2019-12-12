import java.net.*;
import java.io.*;
import java.util.Scanner;

public class OnChatServer {





    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("Server has started. Waiting for connection");
        int count = 1;



            while (true) {

                Socket clientSocket = serverSocket.accept();
                System.out.println("Client has connected " + (count++));


                DataInputStream din = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());
                Scanner sc = new Scanner(System.in);
                String inmessage = din.readUTF();
                String outmessage = sc.nextLine();
                dout.writeUTF(outmessage);
                System.out.println("Client: " + inmessage);
                System.out.println("Me: " + outmessage);


                din.close();
                dout.close();


                clientSocket.close();


            }
            //serverSocket.close();


        }


    }



