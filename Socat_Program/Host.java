package Socat_Program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Host {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",12345);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
        Scanner scanner=new Scanner(System.in);

        String str="",str1="";
        while (!str.equals("stop"))
        {
            str=scanner.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            str1=dataInputStream.readUTF();
            System.out.println("Server Says " +str1 );
        }

    }
}
