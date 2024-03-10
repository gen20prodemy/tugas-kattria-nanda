import Tugas2.Pojo.PojoData;

import java.util.Map;
import java.util.Scanner;

public class MainCrud implements CrudInter{
    @Override
    public void tamabahData(Scanner input, Map<String, PojoData> dataMap) {

        try {
            System.out.print("Masukkan nama: ");

            String nama = input.nextLine();

            // Mengecek apakah nama sudah ada di dalam map
            if (dataMap.containsKey(nama)) {
                System.out.println("Data dengan nama '" + nama + "' sudah ada.");
                return;
            }

            System.out.print("Masukkan No.Nim: ");
            int angka = input.nextInt();
            input.nextLine();

            PojoData data = new PojoData(nama, angka);
            dataMap.put(nama, data);

            System.out.println("Data berhasil ditambahkan.");
        }catch (Exception e) {
            System.err.println("Terjadi Kesalahan Penambahan data");
        }

    }

    @Override
    public void deleteData(Scanner input, Map<String, PojoData> dataMap) {
        try {
            System.out.print("Masukkan nama yang ingin dihapus: ");
            String nama = input.nextLine();

            // Mengecek apakah nama ada di dalam map
            if (!dataMap.containsKey(nama)) {
                System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
                return;
            }

            // Menghapus data dengan nama yang diberikan
            dataMap.remove(nama);

            System.out.println("Data berhasil dihapus.");
        }catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada penghapusan data");
        }
    }




    @Override
    public void tampilanData(Map<String, PojoData> dataMap) {
        try {

            if (dataMap.isEmpty()) {
                System.out.println("Data kosong. Tidak ada data untuk ditampilkan.");
            } else {
                System.out.println("Data pada Map:");
                for (Map.Entry<String, PojoData> entry : dataMap.entrySet()) {
                    System.out.println("Nama: " + entry.getKey() + ", No Nim: " + entry.getValue());
                }
            }
        }catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada penghapusan data");
        }

    }

    @Override
    public void updateData(Scanner scanner, Map<String, PojoData> dataMap) {
        try {
            System.out.print("Masukkan nama yang ingin diubah: ");
            String nama = scanner.nextLine();

            // Mengecek apakah nama ada di dalam map
            if (!dataMap.containsKey(nama)) {
                System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan No nim baru: ");
            int angkaBaru = scanner.nextInt();
            scanner.nextLine(); // Menangani karakter newline setelah input angka

            // Mengupdate data dengan nama yang diberikan
            PojoData dataBaru = new PojoData(nama, angkaBaru);
            dataMap.put(nama, dataBaru);

            System.out.println("Data berhasil diubah.");
        }catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada penghapusan data");
        }

    }
}
