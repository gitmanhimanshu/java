import java.io.File;

public class filee {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\HP\\OneDrive\\Desktop\\aa.jpeg");
        System.out.println("eixts="+f1.exists());
        f1.delete();
        System.out.println("exists"+f1.exists());
    }
}
