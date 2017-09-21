import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        /////// THIS IS A CONSTRUCTOR / EQUIVALENT TO A CONSTRUCTOR FUNCTION IN JS. AND THE SCANNER RECEIVES THE SYSTEM'S INPUT.
        Scanner scan = new Scanner(System.in);

        ///////
//        System.out.println("Enter a integer: ");
//        int userNum = scan.nextInt();
//        System.out.println(userNum);
//
//        //////
//        System.out.println("Enter word: ");
//
//        String wordA = scan.next();
//        String wordB = scan.next();
//        String wordC = scan.next();
//
//        System.out.println("Here are your words " + wordC + " " + wordB + " and " + wordA);

        //////
        System.out.println("Enter length: ");
        int length = scan.nextInt();
        System.out.println("Enter width: ");
        int width = scan.nextInt();


        System.out.println("The area of the room is " + ((length * 2) + (width * 2)));

    }
}
