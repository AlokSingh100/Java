package File_handle;

import java.io.File;
import java.io.IOException;

public class sompt {
    public static void main(String[] args) throws IOException {
        File file=new File("src");
        if (file.createNewFile()) System.out.println("its exists");
        else System.out.println("no file");
    File files[] = file.listFiles();
    for (File ov:files){
        if(ov.isDirectory())
        System.out.println(ov);
        else System.out.println("\t\t\t"+ov);
    }
    }
}
