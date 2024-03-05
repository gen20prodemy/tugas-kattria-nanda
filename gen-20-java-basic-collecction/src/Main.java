import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namaBarang = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Barang (ketik selesai jika penginputan selesai)");
        String inNamaBarang = input.nextLine();

        while (!inNamaBarang.equalsIgnoreCase("selesai")) {
            namaBarang.add(inNamaBarang);
            inNamaBarang = input.nextLine();
        }

            System.out.println("Apa yang ingin anda lakukan dengan data ini?");
            System.out.println("1. Mengetahui Jumlah Nama Barang yang Telah di Input");
            System.out.println("2. Menampilkan Daftar Nama Barang Yang Telah Di input");
            System.out.println("3. Menampilkan Nama Barang Berdasarkan Index");
            System.out.println("4. Konversi Data ke ArrayList ke LinkedList dan Tampilkan");
            System.out.println("Msukkan Pilihan = ");
            int n = input.nextInt();

            switch (n) {
                case 1:
                    sumInputNB(namaBarang);
                    break;
                case 2:
                    daftarNB(namaBarang);
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }

    }

    //cek jumlah input
    public static void sumInputNB(ArrayList<String> nBarang) {
        System.out.print("Jumlah Nama Barang Yang telah di Input = " + nBarang.size());
    }

    //Daftar Nama barang
    public static void daftarNB (ArrayList<String> daftarNB) {
        System.out.println("\nDaftar Nama barang");
        if (daftarNB.isEmpty()) {
            System.out.println("Tidak ada barang yang dimasukkan");
        } else {
            for (String barang : daftarNB) {
                System.out.println("- " + barang);
            }
        }
    }

}