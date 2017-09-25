package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    /////////////////// Return some string.
    public String getString() {
        return scanner.nextLine();
    }

    ////////////////// Return true or false.
    public boolean yesNo() {
        boolean confirmation;
        String confirm = scanner.next();

        if (confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("si")) {
            confirmation = true;

        } else {

            confirmation = false;

        }

        return confirmation;
    }

    ////////////////// Check integer for min and max.
    public int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max + ": ");

        int userNum = scanner.nextInt();

        if (userNum < min || userNum > max) {
            return getInt(min, max);
        } else {
            return userNum;
        }
    }

    ////////////////// Get integer from user.
    public int getInt() {
        return scanner.nextInt();
    }

    ////////////////// Check if input is within min and max parameter.
    public double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max + ": ");

        double userDouble = scanner.nextDouble();

        if (userDouble < min || userDouble > max) {
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }

    ///////////////// Get double from user.
    public double getDouble() {
        return scanner.nextDouble();
    }
}
