import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        System.out.println("Enter integer: ");

        int num = input.nextInt();

        int cubed;

        int squared;

        int test = 0;
        System.out.println("number  |   square  | cube");
        System.out.println("---------------------------");
        for (int i = 0; i <= num; i++) {

            squared = i * i;

            cubed = i * i * i;

            System.out.println();

            System.out.printf("%-5s", i);

            System.out.printf("%5s", squared);

            System.out.printf("%10s", cubed);

        }

    }
}
