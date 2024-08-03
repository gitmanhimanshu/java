import java.io.FileOutputStream;
import java.io.IOException;

public class ex {
    public static void main(String[] args) throws IOException {

        FileOutputStream f1;
        f1=new FileOutputStream("C:/java/fiole.txt",true);
String h="vinay ";
char a[]=h.toCharArray();
for(int i=0;i<h.length();i++){
    f1.write(a[i]);
}
f1.close();
    }
}
