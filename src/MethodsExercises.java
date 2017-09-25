import java.util.Scanner;

public class MethodsExercises {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //////////////////////////////////////////////////////////////
        ////////////////// Simple Math Operation /////////////////////
        //////////////////////////////////////////////////////////////
        add(1, 1);
        subtract(2, 1);
        multiply(2, 2);
        divide(10, 2);
        modulus(10, 5);

        //////////////////////////////////////////////////////////////
        /////////////////////// Number Range /////////////////////////
        //////////////////////////////////////////////////////////////
        getInteger(1, 20);


        //////////////////////////////////////////////////////////////
        ///////////////////////// Factorial //////////////////////////
        //////////////////////////////////////////////////////////////
        String confirm;
        do {
            long userInput = (long) getInteger(1, 10);
            System.out.println(factorialFunc(userInput));
            System.out.println("Would you like to continue? y/n");

            confirm = input.next();
        } while (confirm.equalsIgnoreCase("y"));
        System.out.println("GoodBye");


        //////////////////////////////////////////////////////////////
        ////////////////////// Dice Roll /////////////////////////////
        //////////////////////////////////////////////////////////////
        String roll;

        do {
            int firstRoll = diceRoll();
            int secondRoll = diceRoll();
            System.out.println("First dice roll: " + firstRoll + "\nSecond dice roll: " + secondRoll);
            System.out.println("Would you like to roll it again? y/n");

            roll = input.next();

        } while (roll.equalsIgnoreCase("y"));
        System.out.println("Good Game!");

        //////////////////////////////////////////////////////////////
        ////////////////////////// Game //////////////////////////////
        //////////////////////////////////////////////////////////////


        HighLow();

    }
    ///////////////////////////////////////////
    /////////////// Simple Math ///////////////
    ///////////////////////////////////////////

    //// ADDITION.
    public static double add(int x, int y) {
        return x + y;
    }

    //// SUBTRACTION.
    public static double subtract(int x, int y) {
        return x - y;
    }

    //// MULTIPLICATION.
    public static double multiply(int x, int y) {
        return x * y;
    }

    //// DIVISION.
    public static double divide(int x, int y) {
        return x / y;
    }
    //// MODULUS.
    public static int modulus(int x, int y) {
        return x % y;
    }

    ///////////////////////////////////////////
    ///////////// Integer Range ///////////////
    ///////////////////////////////////////////
    public static int getInteger(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max + ": ");

        int userInput = input.nextInt();

        if (userInput < min || userInput > max) {
            return getInteger(min, max);
        } else {
            return userInput;
        }

    }

    ///////////////////////////////////////////
    //////////////// Factorial ////////////////
    ///////////////////////////////////////////
    public static long factorialFunc(long userInput) {

        int acum = 1;

        String details = "";

        long factorial = 1;

        for (long i = 1; i <= userInput; i++) {
            details += (i == 1) ? i : " x " + 1;
            factorial = factorial * i;
            System.out.println(i +"! = " + details + " = " + (acum *= i));
        }

        return factorial;

    }

    ///////////////////////////////////////////
    /////////////// Roll Dice /////////////////
    ///////////////////////////////////////////
    public static int diceRoll() {

        System.out.println("Enter the number of sides for dice: ");

        int userRoll = input.nextInt();

        int dice = (int) (Math.random() * (userRoll) + 1);


        return dice;
    }

    ///////////////////////////////////////////
    /////////////////// Game //////////////////
    ///////////////////////////////////////////
    public static void HighLow() {
        int randNum = (int) (Math.random() * (100) + 1);
        int userGuess;

        System.out.println(randNum);

        System.out.println("Guess a number between 1 and 100: ");
        userGuess = input.nextInt();

        if (userGuess > randNum) {
            System.out.println("LOWER!");
            System.out.println("try again: ");

        } else if (userGuess < randNum) {
            System.out.println("HIGHER!");
        } else if (userGuess == randNum) {
            System.out.println("YOU GOT IT!!!");
        }

    }

    ////// end
}

