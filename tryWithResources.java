import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class tryWithResources {
    public void resource(){
        File file = new File("example.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        br.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("File not found : "+ file.toString());
        }
    }
    
}
