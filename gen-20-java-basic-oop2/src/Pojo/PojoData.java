package Pojo;

public class PojoData {
    private String nama;
    private int noNim;

    public String getNama() {
        return nama;
    }
    public int getnoNim() {
        return noNim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setnoNim(int noNim) {
        this.noNim = noNim;
    }
    public PojoData(){

    }

    public PojoData(String nama, int noNim) {
        this.nama = nama;
        this.noNim = noNim;
    }
    @Override
    public String toString() {
        return nama + ": " + noNim;
    }
}
