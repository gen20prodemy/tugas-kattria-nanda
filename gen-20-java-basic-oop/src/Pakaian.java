public class Pakaian {
    //atribut
    private String merkProduk;
    private String jenisProduk;
    private int hargaProduk;
   // private int produkTerjual;

    //namaProduk
    public String getMerkProduk() {
        return merkProduk;
    }
    public void setMerkProduk(String namaProduk) {
        this.merkProduk = namaProduk;
    }

    //jenisProduk
    public String getJenisProduk() {
        return jenisProduk;
    }
    public void setJenisProduk(String jenisProduk) {
        this.jenisProduk = jenisProduk;
    }

    //hargaProduk
    public int getHargaProduk() {
        return hargaProduk;
    }
    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    //produkTerjual

   /* public int getProdukTerjual() {
        return produkTerjual;
    }

    public void setProdukTerjual(int produkTerjual) {
        this.produkTerjual = produkTerjual;
    }*/



    //method laba kotor
    public  int labaKotor (int hargaProduk){
        System.out.println("Laba Kotor");
        return this.hargaProduk;
    }

    public Pakaian(){

    }
    public Pakaian (String merkProduk, String jenisProduk, int hargaProduk){

        setMerkProduk(merkProduk);
        setJenisProduk(jenisProduk);
        setHargaProduk(hargaProduk);
        //setProdukTerjual(produkTerjual);
    }

    //print
    public void print(){
        System.out.println("\nMerk = "+merkProduk);
        System.out.println("Jenis Produk = "+jenisProduk);
        System.out.println("Harga Produk = "+hargaProduk);
        //System.out.println("Produk yang terjual = "+produkTerjual+"\n");

    }

}
