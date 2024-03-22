package Tugas2;

import Tugas2.Pojo.PojoData;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, PojoData> mapData = new HashMap<>();

        while (true) {
            System.out.println("\nPilih operasi CRUD:");
            System.out.println("1. Create (tambah data)");
            System.out.println("2. Read (tampilkan data)");
            System.out.println("3. Update (ubah data)");
            System.out.println("4. Delete (hapus data)");
            System.out.println("5. Selesai");

            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menangani karakter newline setelah input angka

            try {
                switch (pilihan) {
                    case 1:
                       // MainCrud.createData(scanner, mapData);
                        break;
                    case 2:
                       // DataManager.readData(mapData);
                        break;
                    case 3:
                       // DataManager.updateData(scanner, mapData);
                        break;
                    case 4:
                      //  DataManager.deleteData(scanner, mapData);
                        break;
                    case 5:
                        System.out.println("Program selesai.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                }
            } catch (Exception e){
            System.err.println("Terjadi eksepsi: " + e.getMessage());
            // (Anda dapat menangani eksepsi lebih spesifik jika diperlukan)
        }
    }
}
}
