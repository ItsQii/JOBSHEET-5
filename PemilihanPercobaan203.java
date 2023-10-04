import java.util.Scanner;

public class PemilihanPercobaan203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai uas: ");
        float uas = input.nextFloat();
        System.out.print("nilai uts: ");
        float uts = input.nextFloat();
        System.out.print("nilai kuis: ");
        float kuis = input.nextFloat();
        System.out.print("nilai tugas: ");
        float tugas = input.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if (total>80){
          System.out.println("nilai anda adalah A ");

        if (total>73){
          System.out.println("nilai anda adalah B+ ");
        }
        if (total>65){
            System.out.println();
        }
        }
    }
}