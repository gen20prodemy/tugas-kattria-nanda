package InputTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MembacaTxt {
    public static void readFile(){
        try (BufferedReader read = new BufferedReader(new FileReader("TugasText.txt"))) {
            String line;
            while((line = read.readLine()) !=null){
                System.out.println(line);
            }
            read.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
