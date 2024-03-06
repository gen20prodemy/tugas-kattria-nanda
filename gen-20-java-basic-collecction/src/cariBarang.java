import java.util.ArrayList;
import java.util.Scanner;

public class cariBarang {
    //berdasarkan nama
    public static String berdasarkanNama (ArrayList<String> nBarang, String nama){
        for (int i = 0 ; i < nBarang.size();i++ ) {
            if (nBarang.get(i).contains(nama)) {
                System.out.println("ditemukan di indeks ke - "+i+1);
                return nBarang.get(i);
            }
        } return null;
    }

    //berdasaarkan index
    public static String berdasarkanIndex (ArrayList<String> nBarang, Integer index){

        for (int i = 0 ; i < nBarang.size();i++ ) {
            if (i==index-1) {
                return nBarang.get(i);
            }
        } return null;
    }
}
