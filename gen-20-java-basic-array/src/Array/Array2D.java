package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static int[][] cetakArray2D(){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris = ");
        int row = in.nextInt();
        System.out.print("Masukkan Jumlah Kolom = ");
        int col = in.nextInt();

        int[][] array2D = new int[row][col];
        for (int i = 0; i < row;){
            for (int j = 0; j<col;j++){
                System.out.print("Masukkan Index Array ["+i+"] ["+j+"] = ");
                array2D[i][j]=in.nextInt();
            }
            i++;
        } System.out.println("Array 2D = "+Arrays.deepToString(array2D));
        return array2D;
    }
   public static int [] sumArray2D(int[][] panjang){
     int sumArray [] = new int[panjang.length];
       for (int i= 0; i< panjang.length; i++ ){
           int sum = 0;
           for (int index : panjang[i]){
               sum += index;
           }
           sumArray[i]=sum;
       }
       System.out.println("Array Penjumlahan = "+Arrays.toString(sumArray));
       return sumArray;
    }
}