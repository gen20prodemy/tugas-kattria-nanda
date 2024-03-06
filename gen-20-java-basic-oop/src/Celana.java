public class Celana extends Pakaian{
    private int modal ;

    public int getModal() {
        return modal;
    }

    public void setModal(int modal) {
        this.modal = modal;
    }

    public static void labaBersih (int labakotor, int modal){
        int labaBersih = labakotor - modal ;
        System.out.println("Laba Bersih = "+labaBersih);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Modal = "+modal);
    }
}
