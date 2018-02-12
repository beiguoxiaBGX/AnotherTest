package socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        Socket socket = null;
        BufferedWriter bw = null;
        try {
            socket = new Socket("127.0.0.1",8888);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
            bw = new BufferedWriter(osw);
            while(true){
                Scanner scanner = new Scanner(System.in);
                if(scanner.hasNext())
                bw.write(scanner.next());
                bw.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bw.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
