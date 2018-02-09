import java.io.*;

public class StreamDemo {

    public static void main(String args[]) throws IOException {
        String folderPath = "E:\\StreamDemo\\Demo";
        String filePath = "\\test.txt";
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdirs();
        }
        File file = new File(folderPath+filePath);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(88);
        fos.close();
        char a = 88;
        System.out.println(a);
    }
}
