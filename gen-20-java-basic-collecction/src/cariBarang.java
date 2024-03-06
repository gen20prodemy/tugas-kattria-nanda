import java.util.ArrayList;
import java.util.Scanner;

public class cariBarang {
    //berdasarkan nama
    public static ArrayList<Integer> berdasarkanNama (ArrayList<String> nBarang, String nama){
        ArrayList listDitemukan = new ArrayList<>();
        for (int i = 0 ; i < nBarang.size();i++ ) {
            if (nBarang.get(i).equalsIgnoreCase(nama)) {
                listDitemukan.add(i);
            }
        } return listDitemukan;
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
