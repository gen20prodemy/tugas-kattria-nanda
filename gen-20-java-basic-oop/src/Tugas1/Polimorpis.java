package Tugas1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Polimorpis {
    public static void main(String[]args) {
        //data Tugas1.Baju dengan inputan user
        Scanner input = new Scanner(System.in);
        ArrayList<Pakaian> detailPakaian = new ArrayList<>();
        System.out.println("Masukkan data Tugas1.Pakaian, ketik \"selesai\" untuk mengakhiri");
        while (true) {
            System.out.print("Merk Tugas1.Baju = ");
            String merk;
            String jenis;
            try {
                merk = input.nextLine();
                if (merk.equalsIgnoreCase("selesai")) {
                    break;
                }
                System.out.print("Jenis = ");
                jenis = input.nextLine();
            } catch (InputMismatchException e) {
                continue;
            }
            int harga = 0;
            try {
                System.out.print("Harga Tugas1.Baju = ");
                harga = Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("error = Opps yang kamu masukkan bukan angka");
                continue;
            }

            Baju baju = new Baju(merk, jenis, harga);
            detailPakaian.add(baju);
        }
    }

}