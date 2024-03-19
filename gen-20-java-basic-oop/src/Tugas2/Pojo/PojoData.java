package Tugas2.Pojo;

public class PojoData {

    private String nama;
    private int angka;

    public String getNama() {
        return nama;
    }
    public int getAngka() {
        return angka;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public PojoData(String nama, int angka) {
            this.nama = nama;
            this.angka = angka;
    }
    @Override
    public String toString() {
        return nama + " " + angka;
    }

}
