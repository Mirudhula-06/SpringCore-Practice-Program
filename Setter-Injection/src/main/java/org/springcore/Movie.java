package org.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {

    private String movie_name;
    private String actor;
    private String genre;
    private double rating;

    public Movie() {
    }

    public String getMovie_name() {
        return movie_name;
    }
    @Value("LEO")
    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getActor() {
        return actor;
    }
    @Value("VIJAY")
    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    @Value("ACTION")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    @Value("4.5")
    public void setRating(double rating) {
        this.rating = rating;
    }
}
