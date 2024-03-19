package ImplementData;

import Interface.InterfaceCrud;
import Pojo.PojoData;
import Tugas2.WriterFile;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class CrudData implements InterfaceCrud {
    @Override
    public void addData(Map<String, PojoData>mapData) {
        Scanner input = new Scanner(System.in);

        System.out.println("Penginputan data Praktikan dengan Format \\\"Nama : No.Nim\\\" (contoh: Nama : 123456)");

        while (true) {
            System.out.print("Silahkan menginput:  \n");
            String nama;
            try {
                 nama = input.nextLine();
                // Mengecek apakah nama sudah ada di dalam map
                if (mapData.containsKey(nama)) {
                    System.out.println("Data dengan nama '" + nama + "' sudah ada.");
                } else if(nama == null){
                    throw new InputMismatchException ("Input tidak boleh kosong");
                }
            }catch (InputMismatchException e){
                System.out.println("Inputan Tidak Sesuai");
                continue;
            }

            // jika ingin mengakhiri
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            // Memisahkan string menjadi dua bagian (nama dan noNim)
            String[] index = nama.split(": ");


            nama = index[0];

            // Mendapatkan noNim dari input dan memastikan enam digit
            int noNim;
            if (index.length > 1) {
                try {
                    noNim= Integer.parseInt(index[1]);

                    // Memastikan angka memiliki enam digit
                    if (String.valueOf(noNim).length() != 6) {
                        throw new NumberFormatException("Angka harus terdiri dari enam digit.");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Format angka tidak valid atau tidak memiliki enam digit.");
                    continue;
                }
            } else {
                System.err.println("Input tidak lengkap. Harap masukkan string dan angka.");
                continue;
            }
            // Menyimpan data ke dalam Map
            PojoData data = new PojoData(nama, noNim);
            mapData.put(nama, data);
            WriterFile toFile = new WriterFile();
            toFile.MaptoTxt(mapData, "DataSiswa.txt");
        }
    }

    @Override
    public void delData(Map<String, PojoData>mapData) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan nama yang ingin dihapus: ");
            String nama = input.nextLine();
            // Mengecek apakah nama ada di dalam map
            if (!mapData.containsKey(nama)) {
                System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
                return;
            }

            // Menghapus data dengan nama yang diberikan
            mapData.remove(nama);

            System.out.println("Data berhasil dihapus.");
        }catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada penghapusan data");
        }

    }

    @Override
    public void printData(Map<String, PojoData>mapData) {
        System.out.println("\nDaftar Praktikan ");
        if (mapData.isEmpty()){
            System.out.println("Tidak ada penginputan data");
        }else {
            for (Map.Entry<String, PojoData> entry : mapData.entrySet()) {
                System.out.println("Nama = " + entry.getKey() + "\tNo.Nim = " + entry.getValue());
            }
        }

    }

    @Override
    public void updateData(Map<String, PojoData> mapData) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan nama yang ingin diubah: ");
            String nama = input.nextLine();

            // Mengecek apakah nama ada di dalam map
            if (!mapData.containsKey(nama)) {
                System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan No nim baru: ");
            int angkaBaru = input.nextInt();
            input.nextLine(); // Menangani karakter newline setelah input angka

            // Mengupdate data dengan nama yang diberikan
            PojoData dataBaru = new PojoData(nama, angkaBaru);
            mapData.put(nama, dataBaru);

            System.out.println("Data berhasil diubah.");
        }catch (Exception e) {
            System.out.println("Terjadi Kesalahan pada penghapusan data");
        }

    }
}


