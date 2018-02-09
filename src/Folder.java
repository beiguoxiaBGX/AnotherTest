import java.io.File;

public class Folder {
    public static void main(String args[]){
        File[] fileList;
        File file = new File("C:\\Windows");
        fileList = file.listFiles();
        File maxFile = fileList[0];
        File minFile = fileList[0];
        for(int i=0;i<fileList.length;i++){
            if(fileList[i].length()>maxFile.length())
                maxFile = fileList[i];
            if(fileList[i].length()>0&&fileList[i].length()<fileList[0].length())
                minFile = fileList[i];
            else if(fileList[0].length()>0)
                minFile = fileList[0];
            System.out.println(fileList[i].getName());
            File[] childFileList = fileList[i].listFiles();
            if(childFileList!=null){
                for(int j=0;j<childFileList.length;j++){
                    System.out.println("  "+childFileList[j].getName());
                }
            }

        }
        System.out.println("最大的文件是："+maxFile.getName()+" 大小为"+maxFile.length());
        System.out.println("最小的非空文件是："+minFile.getName()+" 大小为"+minFile.length());
    }
}
