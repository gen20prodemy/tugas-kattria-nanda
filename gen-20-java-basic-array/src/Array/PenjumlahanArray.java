package Array;

public class PenjumlahanArray {
   public static int sumArray(int[] array){
        int jmlh = 0;
        for (int nilai : array){
            jmlh += nilai;
        }
       System.out.println("Hasil Penjumlahan Array= "+jmlh);
        return jmlh;
    }
}
