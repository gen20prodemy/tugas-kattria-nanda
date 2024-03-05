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
            System.out.println(inNamaBarang+" berhasil di input");

        }

    }
}