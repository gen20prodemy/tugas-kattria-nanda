package Tugas1;

public class Celana extends Pakaian{
    private int modal ;

    public int getModal() {
        return modal;
    }

    public void setModal(int modal) {
        this.modal = modal;
    }

   public Celana (){

    }

    public Celana (String merkProduk, String jenisProduk, int hargaProduk, int modal){
        super(merkProduk, jenisProduk, hargaProduk);
        setModal(modal);
    }

    public int labaBersih (int modal){
        int labaBersih = this.labaKotor(getHargaProduk()) - modal ;
        System.out.println("Laba Bersih = "+labaBersih);
        return labaBersih;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Modal = "+modal);
    }
}
