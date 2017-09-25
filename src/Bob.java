import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Talk to Bob: ");

            String conversation = input.nextLine();

            if (conversation.endsWith("?")) {
                System.out.println("Sure.");
            } else if ((conversation.endsWith("!") || conversation.equals(conversation.toUpperCase())) && !conversation.isEmpty()) {
                System.out.println("Whoa! chill, out!");
            } else if (conversation.isEmpty()) {
                System.out.println("Fine, be that way.");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Continue conversation? y/n");

            String option = input.nextLine();

            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Conversation terminated");
                break;
            }

        }
    }

}
