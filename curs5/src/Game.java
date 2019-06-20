import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNr=generator.nextInt(100);
        System.out.println(randomNr);


        Scanner scan =new Scanner(System.in);
        System.out.println("introduceti numarul...");
        int nr=scan.nextInt();



        while(nr != randomNr){
            if (nr<randomNr){
                System.out.println("Sorry you're too low. Try again");
                 nr=scan.nextInt();

            }else if(nr>0) {
                System.out.println("Sorry you're too high . Try again");
                 nr=scan.nextInt();
            }
        }
        if (nr==randomNr){
            System.out.println("You guessed it! Congratulations");
        }
    }
}
