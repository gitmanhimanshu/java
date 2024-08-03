import java.io.File;
import java.io.IOException;

public class file89 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\HP\\OneDrive\\Desktop\\1670816331956.jpg");
        System.out.println("hai ya nahi "+f1.exists());
        f1.delete();
        System.out.println("hai ya nahi "+f1.exists());

    }
}
