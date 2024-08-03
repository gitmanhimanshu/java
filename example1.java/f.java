import java.io.FileInputStream;
import java.io.IOException;

public class f {
    public static void main(String[] args) throws IOException { int i;
        FileInputStream f1;
        f1=new FileInputStream("C:/java/file");
        do{
            i=f1.read();
            if(i!=-1)
            {
System.out.println((char)i);}
            }while(i!=-1);
        
        f1.close();


    }
    
}
