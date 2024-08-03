import java.io.FileInputStream;
import java.io.IOException;

public class read {

    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream f1=new FileInputStream("C:/java/fiole.txt");
        do{
            i=f1.read();
            if(i!=-1)
             System.out.print((char)i);

        }while (i!=-1);
        f1.close();
    }
}
