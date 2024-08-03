import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class fiole {
    public static void main(String[] args) throws IOException {
        int i;
        FileOutputStream fout;
         fout=new FileOutputStream("C:/java/fiole.txt",true);
        String s="HImanshu";
        char ch[]=s.toCharArray();
        for(i=0;i<s.length();i++){
            fout.write(ch[i]);
        }
        fout.close();
    }
}
