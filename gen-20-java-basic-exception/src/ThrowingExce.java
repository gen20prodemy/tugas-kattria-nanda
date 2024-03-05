import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingExce {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int b1, b2 ;

        System.out.print("Masukkan Bilangan Bulat Positif = ");
        b1 = input.nextInt();
        validBilPos(b1);

        System.out.print("\nMasukkan BIlangan Bulat Negatif = ");
        b2 = input.nextInt();
        validBilNegatif(b2);

    }

    public static int validBilPos (int a){
        if (a<0){
            throw new InputMismatchException("Bilangan yang anda masukkan bukan bil. positif");
        }
            System.out.println("Angka "+a+" adalah bilangan bulat positif");
            return a;
    }

    public static int validBilNegatif (int b){
        if (b>0){
            throw new InputMismatchException("Bilangan yang anda masukkan bukan bil. negatif");
        }
            System.out.println("Angka "+b+" adalah bilangan Negatif");
            return b;
    }
}
