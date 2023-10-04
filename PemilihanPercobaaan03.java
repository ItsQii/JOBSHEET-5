import java.util.Scanner;

public class PemilihanPercobaaan03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
    System.out.print("masukkan angka ");
    int angka = input03.nextInt();
    if (angka % 2 == 0) {
        System.out.println("angka"+angka+"bilangan genap");
    
    } else {
        System.out.println("angka"+angka+"bilangan ganjil");
    } 
    }
}