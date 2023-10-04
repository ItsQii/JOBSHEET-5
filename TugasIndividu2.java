import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "Ripqii";
        String password = "Kepoan";

        System.out.println("Masukkan user: ");
        username = input.nextLine();

        System.out.println("Masukkan password: ");
        password = input.nextLine();

        if (username.equals("Ripqii") && password.equals("Kepoan") ) {
            System.out.println("Proses menuju sistem");
        } else {
            System.out.println("Peringatan! Username atau password anda salah");
        }
    }
}