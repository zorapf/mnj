/*
 * Copyright (c) 2023 Javatar LLC
 * All rights reserved.
 */

package mnj;

/**
 * @author Petro Zora / Javatar LLC
 * @version 2023-02-11
 */
public class TestCRUD {

    public static void main(String[] args) {
        WorkWithSet work = new WorkWithSet();
        work.createMovie(new Movie(1L, "Name", 2022, 4));
        work.createMovie(new Movie(2L, "Name1", 2021, 3));
        work.readMovies(work.movies);
        work.updateMovieById(1L, new Movie(1L, "Name00", 2020, 5));
        System.out.println();
        work.readMovies(work.movies);
        work.deleteMovieById(2L);
        System.out.println();
        work.readMovies(work.movies);

    }

}
