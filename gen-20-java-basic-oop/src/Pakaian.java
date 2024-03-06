public class Pakaian {
    //atribut
    private String merkProduk;
    private String jenisProduk;
    private int hargaProduk;
    private int produkTerjual;

    //namaProduk
    public String getNamaProduk() {
        return merkProduk;
    }
    public void setNamaProduk(String namaProduk) {
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

    public int getProdukTerjual() {
        return produkTerjual;
    }

    public void setProdukTerjual(int produkTerjual) {
        this.produkTerjual = produkTerjual;
    }


    //method laba kotor
    public void labaKotor (int hargaProduk, int produkTerjual){
        System.out.println("Laba Kotor");
    }

    //print
    public void print(){
        System.out.println("Merk = "+merkProduk);
        System.out.println("Jenis Produk = "+jenisProduk);
        System.out.println("Harga Produk = "+hargaProduk);
        System.out.println("Produk yang terjual = "+produkTerjual);

    }

}
