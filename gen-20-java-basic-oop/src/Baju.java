public class Baju extends Pakaian{
   public Baju(){

    }
    public Baju(String merk, String jenis, int harga) {
        super(merk, jenis, harga);
    }

    @Override
    public int labaKotor(int produkTerjual) {
        return super.labaKotor(getHargaProduk())*produkTerjual;
    }

}
