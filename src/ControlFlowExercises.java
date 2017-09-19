import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        int numA = 0;

        do {
            numA += 2;

            System.out.println(numA);
        } while(numA < 100);

        /////////////////////////////////////////////
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        int numB = 100;

        do {
            numB -= 5;

            System.out.println(numB);
        } while(numB > -10);

        /////////////////////////////////////////////
        /////////////////////////////////////////////
        /////////////////////////////////////////////
        int num = 2;

        do {

            num = num * num;

            System.out.println(num);

        } while (num < 65536);
    }
}
