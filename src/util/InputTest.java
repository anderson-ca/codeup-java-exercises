package util;

public class InputTest {
    public static void main(String[] args) {

        Input userInput = new Input();

        ////// get name.
        System.out.println("Enter your name: ");

        String name = userInput.getString();

        System.out.println("Hello, " + name);

        ////// get age.
        System.out.println("Enter age: ");

        int age = userInput.getInt();

        System.out.println(age);

        /////// Get yes or no
        System.out.println("Would you like to continue? y/n");

        boolean userBool = userInput.yesNo();

        System.out.println(userBool);

        /////// Check if number is within specified range.

        System.out.println("Enter number between 1 and 10: ");

        userInput.getInt(1, 10);

        /////// Check if Double is within specified range.

        System.out.println("Enter number between 1 and 10: ");

        userInput.getDouble(1.0,10.0);

        /////// Get double from user.
        System.out.println("Enter a double: ");

        double userDouble = userInput.getDouble();

        System.out.println(userDouble);


    }
}
