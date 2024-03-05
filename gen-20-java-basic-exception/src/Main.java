import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Penginputan Biodata Pengguna");
        Scanner input = new Scanner(System.in);

        System.out.print("Nama = ");
        String nama = input.nextLine();
        validasiNama(nama);

        System.out.print("Umur = ");
        Integer umur = input.nextInt();
        validUmur(umur);

        input.nextLine();

        System.out.print("Nomor HP= ");
        String noHp = input.nextLine();
        validNomor(noHp);

        System.out.println();
        userDataToFile(nama,umur,noHp);

        System.out.println("Data Telah Tersimpan dengan nama file userData.txt");

        input.nextLine();
        System.out.print("Baca File dengan Nama = ");
        String namaFile = input.nextLine();
        readUserDataFile(namaFile);

    }
    public static void validasiNama (String username) throws CostumeException{
        // tidak boleh berisi angka
        if (username.matches(".*\\d.*")) {
            throw new CostumeException("Nama tidak boleh berisi angka");
        }

        //Nama Harus dengan Huruf Besar
        if (!username.matches("[A-Z]+")) {
            throw new CostumeException("Nama harus huruf besar");
        }

        //dengan panjang 6
        if (username.length() < 6 | username.length() >10){
            throw new CostumeException("Nama tidak lebih dari 6 karakter");
        }
    }
    public static void validUmur (int age) throws CostumeException {
        //tidak boleh dibawah
        if (age < 18) {
            throw new CostumeException("Anda di bawah umur");
        }
    }

    public static void validNomor (String nomorHp) throws CostumeException {
        //tidak boleh dibawah
        if (nomorHp.length() < 11 | nomorHp.length() >12) {
            throw new CostumeException("Nomor Hp tidak sesuai format");
        }
    }

    public static void userDataToFile (String nama, int umur, String nomorHp) {
        try (BufferedWriter writter = new BufferedWriter(new FileWriter("userdata.txt"))) {
            writter.write("Nama = "+nama+"\n");
            writter.write("Umur = "+umur+"\n");
            writter.write("No. Hp = "+nomorHp+"\n");
        }catch(IOException e){
            System.out.println("Gagal Membuat File "+ e.getMessage());
        }
    }

    public static void readUserDataFile (String namaFile) {
        try (BufferedReader read = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = read.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Gagal Membaca "+ e.getMessage());
        }
    }


}