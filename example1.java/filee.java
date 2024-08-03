import java.io.FileOutputStream;
import java.io.IOException;

public class filee {
    public static void main(String[] args)throws IOException  {
        FileOutputStream f1;
        f1=new FileOutputStream("C:/java/file",true);
        String s="himanshu";
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            f1.write(a[i]);
        }

        f1.close();
    }
    
}
