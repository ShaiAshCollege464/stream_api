package org.example;

import java.util.List;
import java.util.Map;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary () {
        List<List<String>> directorsData = Utils.readFile("directors.csv");
        //move on
    }


//    // 1. Find all movies released in a specific year.
//    // Return a list of movie titles.
//    public List<String> findMoviesByYear(int year) {
//        // Implement using declarative programming
//    }
//
//    // 2. Find all movies of a specific genre.
//    // Return a list of movie titles.
//    public List<String> findMoviesByGenre(String genre) {
//        // Implement using declarative programming
//    }
//
//    // 3. Find all directors who have directed at least N movies.
//    // Return a list of director names.
//    public List<String> findDirectorsWithAtLeastNMovies(int n) {
//        // Implement using declarative programming
//    }
//
//    // 4. Find all actors who have appeared in movies of a specific genre.
//    // Return a list of actor names.
//    public List<String> findActorsInGenre(String genre) {
//        // Implement using declarative programming
//    }
//
//    // 5. Find the average release year of movies for a specific director.
//    // Return a double value.
//    public double findAverageReleaseYearForDirector(String directorName) {
//        // Implement using declarative programming
//    }
//
//    // 6. Find the top N actors who have appeared in the most movies.
//    // Return a list of actor names.
//    public List<String> findTopNActors(int n) {
//        // Implement using declarative programming
//    }
//
//    // 7. Find all movies where a specific actor and director have worked together.
//    // Return a list of movie titles.
//    public List<String> findMoviesByActorAndDirector(String actorName, String directorName) {
//        // Implement using declarative programming
//    }
//
//    // 8. Find the most common genre for each actor.
//    // Return a map with actor names as keys and the most common genre as values.
//    public Map<String, String> findMostCommonGenrePerActor() {
//        // Implement using declarative programming
//    }
//
//    // 9. Find the director with the highest average movie rating (1-5).
//    // Assume there is a method: double getMovieRating(Movie movie), which returns the rating of a movie.
//    // Return the director name.
//    public String findDirectorWithHighestAverageRating() {
//        // Implement using declarative programming
//    }


}
