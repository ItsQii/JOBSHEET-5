import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
    
        int Distance;

        Scanner input = new Scanner(System.in);

        System.out.println("Distance to enemy");
        Distance = input.nextInt();
        
        if (Distance >= 5) {
            System.out.print("use range weapon ");
        } else {
            System.out.print("use melee weapon ");
        }
    }   
}