import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlow {
}
class Kotak {
      int  panjang;
      int  lebar;
      int  tinggi;
    public Kotak(int p, int l, int t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
}

class KotakPejal extends Kotak {
        private double berat;
        KotakPejal(int p, int l, int t, int b) {
            super(p, l, t); // memanggil constructor kelas Kotak
            berat = b;
        }
}

