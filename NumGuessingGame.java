import java.util.Random;
import java.util.Scanner;

public class NumGuessingGame {
    public static void main(String[] args) {
        Random rand  = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------WELCOME TO NUMBER GUESSING GAME-------------");
        System.out.println(" You Will have 10 Turns Only ! ");
        System.out.println(" BEST OF LUCK...!! ");
        int RandomNo = rand.nextInt(100) + 1;
        int count = 0;
        while (true){
            if (count >= 10){
                System.out.println(" oops ! Game is Over...! \n You have taken Maximum Tries ");
                System.exit(0);
            }
            System.out.println("Enter Your Guess Number between 1 too 100 ... ");
            int PlayGuess = sc.nextInt();
            count++;
            if ( PlayGuess == RandomNo)
            {
                System.out.println(" Yehh !! Correct Answer ...! ");
                System.out.println(" You WIN ...!! ");
                System.out.println(" Number of Tries : " + count);
                break;
            }
            else if (RandomNo > PlayGuess)
            {
                System.out.println(" Your Guessing Number is Higher...! ");
            }
            else
            {
                System.out.println(" Your Guessing Number is Lower ...! ");
            }
        }
        int score = count * 10;
        System.out.println(" Your Score Is : " + score);
        System.out.println(" Thank You For Playing Game...!!");
    }
}
