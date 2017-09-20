import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        System.out.println("Enter your grade: ");

        int grade = input.nextInt();

        if(grade < 50) {
            System.out.println("F");
        } else if(grade <= 69) {
            System.out.println("D");
        } else if(grade <= 79) {
            System.out.println("C");
        } else if(grade <= 89) {
            System.out.println("B");
        } else if(grade >= 90) {
            System.out.println("A");
        }

    }
}
