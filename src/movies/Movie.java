package movies;

public class Movie {
    ////////// Movie name.
    private String name;

    ///////// Movie category.
    private String category;


    ////////// getters
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }

    ///////// Constructor function.
    public Movie(String name, String category) {

        this.name = name;

        this.category = category;

    }


}
