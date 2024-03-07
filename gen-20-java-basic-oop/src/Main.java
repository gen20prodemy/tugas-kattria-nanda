import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //data Baju dengan inputan user
        Scanner input = new Scanner(System.in);
        ArrayList <Baju> detailBaju = new ArrayList();
        System.out.println("Masukkan data Baju, ketik \"selesai\" untuk mengakhiri");
        while (true) {
            System.out.print("Merk Baju = ");
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
                      System.out.print("Harga Baju = ");
                      harga = Integer.parseInt(input.nextLine());

                } catch (NumberFormatException e){
                      System.out.println("error = Opps yang kamu masukkan bukan angka");
                      continue;
                }

            Baju baju = new Baju (merk, jenis, harga);
            detailBaju.add(baju);
        }

        System.out.println("Data Baju Yang dimasukkan = ");
        for (Baju baju : detailBaju){
            baju.print();
            /*System.out.println("\nMerek = "+ baju.getMerkProduk());
            System.out.println("Jenis = "+ baju.getJenisProduk());
            System.out.println("HArga = "+ baju.getHargaProduk());
            System.out.println("Produk Terjual = "+baju.getProdukTerjual());*/
        }


        System.out.print("Merk ke berapaa yang ingin dilihat labanya = ");
        int index = input.nextInt();

        if (!detailBaju.isEmpty()){
            Baju baju2 = detailBaju.get(index);

            System.out.println("\nJumlah Produk Yang Terjual = ");
            int produkTerjual = Integer.parseInt(input.nextLine());

            int hasilLaba = baju2.labaKotor(produkTerjual);
            System.out.println("Laba dari produk "+ baju2.getMerkProduk()+ " = "+hasilLaba);
        }


        //Clana default

        Celana newCelana  = new Celana();
        newCelana.setMerkProduk("Levi's");
        newCelana.setJenisProduk("Cargo");
        newCelana.setHargaProduk(500000);

        newCelana.setModal(200000);

        newCelana.print();

        int lababersih = newCelana.labaBersih(newCelana.getModal());

        System.out.println("Laba bersih untuk merk "+newCelana.getMerkProduk()+" = "+lababersih);

        //polimorpis
        Pakaian gamis = new Baju("Zazkia", "Gamis", 10000); //jenisnya pakaian yang merupakan obj dari baju
        gamis.print();


    }
}