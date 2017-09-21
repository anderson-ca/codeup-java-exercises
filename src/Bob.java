import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Talk to Bob: ");

        String conversation = input.nextLine();

        if(conversation.endsWith("?")) {
            System.out.println("Sure.");
        } else if (conversation.endsWith("!")) {
            System.out.println("Whoa! chill, out!");
        } else if(conversation.equals("")) {
            System.out.println("Fine, be that way.");
        } else {
            System.out.println("Whatever.");
        }
    }
}
