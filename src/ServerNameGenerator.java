import java.util.Arrays;

public class ServerNameGenerator {


    public static void main(String[] args) {
        //////////////////////
        String adjs[] = {"ambiguous", "grammatical", "remaining", "sensitive", "communist", "historic", "complex", "informal", "territorial", "formidable"};

        //////////////////////
        String nouns[] = {"company", "teaching", "resolution", "disappointment", "adventure", "accountability", "junction", "instinct", "charm", "achievement"};

        randomElement(adjs, nouns);


    }

    /////// List of adjectives.

    /////// List of nouns.

    ///////////////////////////////////////////////////////////////////////////
    //////////////////// Random Element Display Function //////////////////////
    ///////////////////////////////////////////////////////////////////////////
    public static void randomElement(String[] someList, String[] otherList) {

        int someIndex = (int) Math.floor(Math.random() * someList.length);

        int otherIndex = (int) Math.floor(Math.random() * otherList.length);

        System.out.println("Here is your server name: " + someList[someIndex] + " " + otherList[otherIndex]);

    }

}
