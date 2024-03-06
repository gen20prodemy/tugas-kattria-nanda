public class Baju extends Pakaian{
    @Override
    public void labaKotor(int hargaProduk, int produkTerjual) {
        int labaKotor = hargaProduk * produkTerjual ;
        System.out.println("Laba Kotor = "+labaKotor);
    }

}
