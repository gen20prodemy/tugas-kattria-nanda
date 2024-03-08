package Tugas.DataKelas;

import Tugas.InputTxt.WriterFile;
import Tugas.Pojo.PojoData;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataKelas {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, PojoData> mapData = new HashMap<>();

        System.out.println("Penginputan data Praktikan dengan Format \"Nama : No.Nim\" (contoh: Nama : 123456)");
        System.out.println("Ketik\"selesai\" jika penginputan telah selesai ");

        while (true) {
            System.out.print("Silahkan menginput:  \n");
            String inputString = scanner.nextLine();

            // jika ingin mengakhiri
            if (inputString.equalsIgnoreCase("selesai")) {
                break;
            }

            // Memisahkan string menjadi dua bagian (nama dan angka)
            String[] index = inputString.split(": ");


            // Mendapatkan nama dari input
            String nama = index[0];

            // Mendapatkan angka dari input dan memastikan enam digit
            int angka;
            if (index.length > 1) {
                try {
                    angka = Integer.parseInt(index[1]);

                    // Memastikan angka memiliki enam digit
                    if (String.valueOf(angka).length() != 6) {
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
            PojoData data = new PojoData(nama, angka);
            mapData.put(nama, data);
        }
        cetakMapData(mapData);

        WriterFile newFile = new WriterFile();

        newFile.MaptoTxt(mapData,"Daftar Praktikan");
        System.out.println("Data Berhasil di simpan");
    }

        public static void cetakMapData (Map<String, PojoData> mapData){
            System.out.println("\nDaftar Praktikan ");
            if (mapData.isEmpty()){
                System.out.println("Tidak ada penginputan data");
            }else {
                for (Map.Entry<String, PojoData> entry : mapData.entrySet()) {
                    System.out.println("Nama = " + entry.getKey() + "\tNo.Nim = " + entry.getValue());
                }
            }
        }


    }

