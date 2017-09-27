package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        // importing the Input functionality to my method.
        Input userInput = new Input();

        // do while loop used to display message and take input from the user.
        do {
            System.out.println("What would you like to do?\n\n0 - Exit.\n1 - view all movies.\n2 - view movies in animated category.\n3 - view movies in drama category.\n4 - view movies in horror category\n5 - view movies in scifi category.\n\n Enter your choice:");

            int userAction = userInput.getInt();

            //method call of function created to take user input(Recursion)
            getMoviesByCategories(userAction);

        // condition to break the loop. using method I created to take yes/no input.
        } while (userInput.yesNo());
        System.out.println("goodbye");
    }


    // Method used to display movies based on user interaction( inside this method I use a method call of the showMovies method in order to filter movies based on the category).
    public static void getMoviesByCategories(int someAction) {
        switch (someAction) {
            case 0:
                break;
            case 1:
                showMovies("all");
                break;
            case 2:
                showMovies("animated");
                break;
            case 3:
                showMovies("drama");
                break;
            case 4:
                showMovies("horror");
                break;
            case 5:
                showMovies("scifi");
                break;
            default:
                break;
        }

    }

    // Method used to sout movies. (all movies or filtered by category based on user input)
    public static void showMovies(String category) {
        Movie[] movieList = MoviesArray.findAll();

        System.out.println("this is a list of " + category + " movies:");
        System.out.println("=====================");

        // This loop filters my movie list based on the category.
        for (Movie movie : movieList) {
            if (movie.getCategory().equalsIgnoreCase(category) || category.equalsIgnoreCase("all")) {
                System.out.println(movie.getName() + " " + movie.getCategory());
            }
        }

        System.out.println("=====================");
        System.out.println("continue y/n?");

    }

}
