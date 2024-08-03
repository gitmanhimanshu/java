import java.io.FileOutputStream;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("C:/java/fiole",true);
        String h="arun Chakravarti";
        char a[]=h.toCharArray();
        for(int i=0;i<h.length();i++){
            f1.write(a[i]);
        }
        f1.close();
    }
}