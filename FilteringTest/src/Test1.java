import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("MAsukkan Panjang array = ");
        int n = in.nextInt();

        int[] array = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("Masukkan Index Array = ");
            array[i]=in.nextInt();
        }
        System.out.println("Masukkan nilai d = ");
        int d = in.nextInt();

        int hasil = beautifulTriplets(array,d);

        System.out.println("\n"+hasil);

    }

    public static int beautifulTriplets (int [] arr, int d){
        int n = arr.length;
        int triplet = 0;
        for (int i=0; i<n-2;i++){
            for (int j = i+1; j<n-1;j++){
                if (arr [j]-arr[i]==d){
                    for (int k=j+1; k<n; k++){
                        if (arr[k]-arr[j]==d){
                            triplet++;
                        }
                    }
                }
            }
        }
        return triplet;
    }
}
