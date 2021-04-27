import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class errorHandling {
    public static void main(String[] args) throws FileNotFoundException{
        // try {
        //     File f = new File("randompath");
        //     FileReader ff = new FileReader(f);
        //     System.out.println(ff);
        // } catch (Exception e) {
        //    e.printStackTrace();
        // }
        // File f = new File("Random");
        // FileReader ff = new FileReader(f);
            String[] arr = {"value1","value2","value3"};
            try {
                System.out.println(arr[3]);
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.toString());
            }
    }
}
