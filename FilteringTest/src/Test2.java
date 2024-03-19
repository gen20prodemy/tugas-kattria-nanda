import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan banyak peluang yang ingn dicoba = ");
        int t = in.nextInt();
        for(int i=1; i<=t; i++) {

            System.out.println("Jumlah hadiah Hitam = ");
            int B = in.nextInt();
            System.out.println("Jumlah hadiah putih = ");
            int W = in.nextInt();

            System.out.println("Biaya untuk hadiah hitam = ");
            int bc = in.nextInt();
            System.out.println("Biaya untuk hadiah putih = ");
            int wc = in.nextInt();
            System.out.println("Biaya to Convert = ");
            int z = in.nextInt();

            int minCost = minimumCost(B, W, bc, wc, z);
            System.out.println("biaya minimum : " + minCost);
        }

    }
    public static int minimumCost (int B, int w, int bc, int wc, int z){
        int minBw = Math.min(bc, wc+z);
        int minWc = Math.min(wc, bc +z);
        int cost = B*minBw + w*minWc;
        return cost;
    }
}
