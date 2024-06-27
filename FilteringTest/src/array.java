import java.util.Scanner;

public class array {
    public static void main (String[]args){
        //Scanner in = new Scanner(System.in);
        int n = 4;

        String [][] arr = new String [n][n];

        for (int i=0 ; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==j || i+j== n-1){
                arr[i][j]="*";
                } else {
                    arr[i][j] = " ";
                }
            }
        }
        for (int i=0; i<n ; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
