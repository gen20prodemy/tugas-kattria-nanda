import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class KonversiArrayListToSet {
    public static Set<String> konversiKeSet (ArrayList<String> namaList){
        return new HashSet<>(namaList);
    }

    public static void cetakKonversi(ArrayList<String> listBaru){
        Set<String> setList = konversiKeSet(listBaru);

        System.out.println("Hasil Konversi Ke Set = ");
        for (String isi : setList){
            System.out.println(isi);
        }

    }

}
