import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> namaBarang = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Barang (ketik selesai \njika penginputan selesai)");
        String inNamaBarang = input.nextLine();

        while (!inNamaBarang.equalsIgnoreCase("selesai")){
            namaBarang.add(inNamaBarang);
            inNamaBarang = input.nextLine();
        }

        System.out.println("\nDaftar Nama barang");

        if (namaBarang.isEmpty()) {
            System.out.println("Tidak ada barang yang dimasukkan");
        }else {
            for (String barang : namaBarang){
                System.out.println("- "+barang);
            }
        }

    }
}