package Socat_Program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Clints {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(12345);
        Socket socket=serverSocket.accept();

        DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        Scanner scanner=new Scanner(System.in);

        String str="",str2="";
        while (!str.equals("stop"))
        {
            str=scanner.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            str2=dataInputStream.readUTF();
            System.out.println("Server Says " +str2 );
        }
        dataInputStream.close();
        serverSocket.close();
        socket.close();
    }
}
