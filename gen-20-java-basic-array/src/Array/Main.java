package Array;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Tugas Array Prodemy");
        System.out.println("1. Array 1 Dimensi \n2. Penjumlahan Array\n3. Array 2D dan Penjumlahannya\n4. Transpose Array");
        System.out.print("Masukkan Pilihan = ");
        int n = input.nextInt();

        switch (n){
            case 1:
                Array1D.cetakArray();
                break;
            case 2:
                int [] myArray =  Array1D.cetakArray();
                int sumArray = PenjumlahanArray.sumArray(myArray);
                break;
            case 3:
                int[][] myArray2D = Array2D.cetakArray2D();
                int [] sumArray2D = Array2D.sumArray2D(myArray2D);
                break;
            case 4:
                TransposeArray.transposeArray();
                break;

        }
    }
}