package InputTxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputCreatTxt {
    public static void buatFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("TugasText.txt"));  //class untuk membaca file pada java
            writer.write("Cara Membuat File pada Java");
            writer.write("\n 1. gunakan class \"BufferedWriter\" untuk memasukkan inputan string dan  \"FileWriter\" untuk membuat file tersebut");
            writer.write("\n 2. gunakan perintah \"writer.(nama object bufferedWriter)\" untuk mengetik atau mengisi file ");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
