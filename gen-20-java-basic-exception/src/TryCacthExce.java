import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCacthExce {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int b1,b2;
        try{
            System.out.print("Masukkan Bilangan Pertama = ");
            b1 = input.nextInt();
            System.out.print("Masukkan Bilangan Kedua = ");
            b2 = input.nextInt();
            pembagian(b1,b2);
        } catch (ArithmeticException e){
            System.err.println("\nError = Tidak Membagi dengan Nol");
        }catch (InputMismatchException e){
            System.err.println("\nError = Masukkan Bilangan Berupa Angka");
        }finally {
            input.close();;
        }

    }
    public static int pembagian (int a, int b){
        int hasil = a/b;
        System.out.println("Hasil Bagi = "+hasil);
        return hasil;
    }
}
