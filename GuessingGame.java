/*Lee-Martin Clarke
  HomeWork 5
 */

import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Welcome to the guessing game. Guess a number between 1 and 100.");

        Random rand = new Random();

        int randomNumber = rand.nextInt(101) + 1;

        int numberOfTries = 0;

        Scanner input = new Scanner(System.in);

        int guess;

        boolean Winner = false;



        while (Winner == false ){

                 guess = input.nextInt();

                 numberOfTries++;

                if (guess == randomNumber) {

                    Winner = true;

                } else if (guess > randomNumber) {

                    System.out.println("Too High! Guess Again.");

                } else if (guess < randomNumber) {

                    System.out.println("Too low! Guess Again.");

                }



        }

        System.out.println("WINNER!!!");

        System.out.println("The number was " + randomNumber);

        System.out.println("It took you " + numberOfTries + " tries.");

    }
}

