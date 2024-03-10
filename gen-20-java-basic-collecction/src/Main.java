import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namaBarang = new ArrayList<>();


            System.out.println("Apa yang ingin anda lakukan dengan data ini?");
            System.out.println("1. Mengetahui Jumlah Nama Barang yang Telah di Input");
            System.out.println("2. Menampilkan Daftar Nama Barang Yang Telah Di input");
            System.out.println("3. Menampilkan Nama Barang Tertentu");
            System.out.println("4. Konversi Data ke ArrayList ke HasSet dan Tampilkan");
            System.out.print("Masukkan Pilihan = ");
            int n = input.nextInt();
           //validPilihan(n);

            switch (n) {
                case 1:
                    sumInputNB(namaBarang);
                    break;
                case 2:
                    daftarNB(namaBarang);
                    break;
                case 3:
                    cariNamaBarang(namaBarang);
                    break;
                case 4:
                    KonversiArrayListToSet.cetakKonversi(namaBarang);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;

            }

    }

    //Exception
    /*public static int validPilihan (int a){
        try{
            Scanner in = new Scanner(System.in);
            a=in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Opss pilihan yang anda masukkan tidak tersedia");
        }finally {
            return a;
        }

    }*/


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

    //menampilkan nama barang tertentu
    private static void cariNamaBarang (ArrayList<String> nBarang){
        Scanner in = new Scanner(System.in);
        System.out.println("Cari Barang Berdasarkan");
        System.out.println("1. Nama");
        System.out.println("2. index");
        System.out.print("Masukkan pilihan = ");
        int a = in.nextInt();
        switch (a){
            case 1:
                System.out.print("Cari = ");
                in.nextLine();

                String nama = in.nextLine();

                ArrayList<Integer> namaBarang = cariBarang.berdasarkanNama(nBarang, nama);
                if (!namaBarang.isEmpty()){
                    System.out.println("Nama ' "+nama+ "' ditemukan di index : "+namaBarang);
                }else {
                    System.out.println("Barang tidak di temukan");
                }
                break;
            case 2:
                System.out.print("Cari Index ke = ");
                int index = in.nextInt();
                String barangCari = cariBarang.berdasarkanIndex(nBarang, index);
                if (barangCari !=null){
                    System.out.println("\nBarang ke "+index+ " ditemukan dengan nama \""+barangCari+"\"");
                }else {
                    System.out.println("Barang tidak di temukan");
                }
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
                break;
        }
    }

    //Menambahkan data
    public static void inputData (ArrayList<String> nBarang){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Barang (ketik selesai jika penginputan selesai)");
        String inNamaBarang = input.nextLine();

        while (!inNamaBarang.equalsIgnoreCase("selesai")) {
            namaBarang.add(inNamaBarang);
            inNamaBarang = input.nextLine();
        }
    }

}//akhir program