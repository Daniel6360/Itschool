import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul...");
        int number= scan.nextInt();



        System.out.println(NumberSum.calculate(number));

    }
}
