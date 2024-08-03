public class exception {
    public static void main(String[] args) {
        try{
            System.out.println("start");
            int i=0;
            int j=1;
            System.out.println(1/0);
            System.out.println("end");
        }
        catch(Exception e){
            System.out.println("error "+e.getMessage());
        }
    }
    
}
