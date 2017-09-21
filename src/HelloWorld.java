import java.util.Scanner;

public class HelloWorld {
    // psvm
    //entry point
    public static void main(String[] args) {
        //sout
//        System.out.println("hello world!");
//        System.out.print("hello Redwood!");

        ////////////// IO
        Scanner scan = new Scanner(System.in);
        // ask name
        System.out.println("Give me your name: ");
        String name = scan.nextLine();
        System.out.println("is your name " + name + "?");

        // ask age
        System.out.print("Give me  your age: ");
        byte age = scan.nextByte();
        System.out.println("Is your age " + age + "?");

    }
}
