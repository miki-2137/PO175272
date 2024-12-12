package zad1;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
    String title;
    String director;
    String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "" +
                title +
                " - " + director;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.title.length(), o.title.length());
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Dune","D. Villeneuve","Sci-fi"));
        movies.add(new Movie("Pulp Fiction","Q. Tarantino","Action"));
        movies.add(new Movie("Snatch","G. Ritchie","Action"));
        movies.add(new Movie("Django Unchained","Q. Tarantino","Western"));

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);
    }
}
