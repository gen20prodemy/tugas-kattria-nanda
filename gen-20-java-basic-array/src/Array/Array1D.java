package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static int[] cetakArray( ){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang Array = ");
        int n = in.nextInt();

        int[] array = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("Masukkan Index Array = ");
            array[i]=in.nextInt();
        }
        System.out.println("Array 1D = "+Arrays.toString(array));
        return array;
    }
}
