import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        for (int i = 0; i < 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            }

        }

    }
}
