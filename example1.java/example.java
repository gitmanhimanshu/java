
package example1.java;
import java.io.File;
import java.io.IOException;

public class example {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:java/example1.java/example");
        f1.createNewFile();
        System.out.println(" is exist:"+f1.exists());
        System.out.println(" name:"+f1.getName());
        System.out.println(" length:"+f1.length());

    }
}
