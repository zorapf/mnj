/*
 * Copyright (c) 2023 Javatar LLC
 * All rights reserved.
 */

package mnj;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Petro Zora / Javatar LLC
 * @version 2023-02-11
 */
public class WorkWithSet {

    Set<Movie> movies = new HashSet<>();

    public void createMovie(Movie movie) {
        movies.add(movie);
    }

    public void readMovies(Set<Movie> movies) {
        for (Movie movie: movies) {
            System.out.println(movie.toString());
        }
    }

    public void  updateMovieById(long id,Movie movieUpdate) {
        for (Movie movie: movies) {
            if(movie.getId()==id){
                movie.setName(movieUpdate.getName());
                movie.setYear(movieUpdate.getYear());
                movie.setRating(movieUpdate.getRating());
            }
        }
    }

    public void  deleteMovieById(long id) {
        movies.removeIf(movie -> movie.getId() == id);
    }

}
