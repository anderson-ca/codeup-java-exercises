import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        add(1, 1);
        subtract(2, 1);
        multiply(2, 2);
        divide(10, 2);
        modulus(10, 5);

        getInteger(1, 10);

    }
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////

    //// ADDITION.
    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    //// SUBTRACTION.
    public static void subtract(int x, int y) {
        System.out.println(x - y);
    }

    //// MULTIPLICATION.
    public static void multiply(int x, int y) {
        System.out.println(x * y);
    }

    //// DIVISION.
    public static void divide(int x, int y) {
        System.out.println(x / y);
    }

    //// MODULUfffrgdfgtgS.
    public static void modulus(int x, int y) {
        System.out.println(x % y);
    }

    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    public static void getInteger(int min, int max) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between " + min + " and " + max + ": ");

        int userInput = input.nextInt();

        if (userInput > max || userInput < min) {
            getInteger(min, max);
        } else {
            System.out.println("All done!");
        }

    }

    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////






    ////// end
}

