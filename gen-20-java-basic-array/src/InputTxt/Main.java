package InputTxt;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Tugas Prodemy Gen 20");
        System.out.println("1. Membuat dan mengisi File .txt \n2. Membaca File .txt");
        System.out.print("Masukkan Pilihan = ");
        int n = input.nextInt();

        switch (n){
            case 1:
                InputCreatTxt.buatFile();
                break;
            case 2:
                MembacaTxt.readFile();
                break;
        }
    }
}
