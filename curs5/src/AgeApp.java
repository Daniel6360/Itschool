import java.util.Scanner;

public class AgeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti varsta...");
        int age=scan.nextInt();
        AgeVerify.verify(age);
    }
}
