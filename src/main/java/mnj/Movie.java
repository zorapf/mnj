/*
 * Copyright (c) 2023 Javatar LLC
 * All rights reserved.
 */

package mnj;

import java.util.Objects;

/**
 * @author Petro Zora / Javatar LLC
 * @version 2023-02-11
 */
public class Movie {
    private long id;
    private String name;
    private int year;
    private int rating;

    public Movie() {
    }

    public Movie(long id, String name, int year, int rating) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && year == movie.year && rating == movie.rating && Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, rating);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}
