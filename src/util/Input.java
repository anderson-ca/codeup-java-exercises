package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {

        scanner = new Scanner(System.in);
    }

    /////////////////// Return some string.
    public String getString() {

        return scanner.nextLine();
    }

    ////////////////// Return true or false.
    public boolean yesNo() {

        String confirm = scanner.next();

        return confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes");

    }

    ////////////////// Check integer for min and max.
    public int getInt(int min, int max) {

        int userNum = getInt();

        if (userNum < min || userNum > max) {

            System.out.println("Enter a number between " + min + " and " + max + ": ");

            return getInt(min, max);

        }

        return userNum;

    }

    ////////////////// Get integer from user.
    public int getInt() {
        if (this.scanner.hasNextInt()) {

            return scanner.nextInt();

        } else {

            System.out.println("Invalid Input!");

            scanner.nextLine();

            return getInt();
        }
    }

    ////////////////// Check double for min and max.
    public double getDouble(double min, double max) {

        double userNum = getDouble();

        if (userNum < min || userNum > max) {

            System.out.println("Enter a number between " + min + " and " + max + ": ");

            scanner.nextLine();

            return getDouble(min, max);
        }

        return userNum;

    }

    ////////////////// Get double from user.
    public double getDouble() {

        if (this.scanner.hasNextDouble()) {

            return scanner.nextDouble();

        } else {

            System.out.println("Invalid Input!");

            scanner.nextLine();

            return getDouble();

        }
    }
}
