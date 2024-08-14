import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minimumRange = 1;
        int maximumRange = 100;
        int maxAttempts = 8;
        int points = 100;
        
        System.out.println("Welcome to the Number Guessing Game\n");
        boolean play = true;
        
        while (play) {
            int randomNumber = random.nextInt(maximumRange - minimumRange + 1) + minimumRange;
            System.out.printf("Round - Range: %d to %d\n", minimumRange, maximumRange);
            System.out.println("You have " + maxAttempts + " attempts.\n");
            points = 80;
            int attempted = 0;
            boolean goodguess = false;
            
            while (attempted <= maxAttempts) {
                System.out.print("Guess the Number: ");
                int userGuess = scanner.nextInt();
                
                attempted++;
                
                if (userGuess == randomNumber) {
                    System.out.printf("Bingo! You guessed the number in %d attempts.\n", attempted);
                   
                    System.out.println("Congrats! You got: " + points + " out of 80 \n");
                    goodguess = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.\n");
                    points-=10;
                } else {
                    System.out.println("Too high! Try again.\n");
                    points-=10;
                }
            }
            
            if (!goodguess) {
                System.out.println("Good try, but you've used all your attempts. The correct number was " + randomNumber);
            } 
            System.out.print("Shall we go for another round? (yes/no):");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                play = false;
            }
        }
        
        System.out.println("We appreciate your participation!");
        
        scanner.close();
    }
}
