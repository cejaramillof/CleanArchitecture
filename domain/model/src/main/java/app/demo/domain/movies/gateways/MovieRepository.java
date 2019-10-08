package app.demo.domain.movies.gateways;

import app.demo.domain.movies.Movie;

import java.util.List;

public interface MovieRepository {

    Movie save(Movie movie);
    void saveAll(List<Movie> movies);
    Movie findById(String id);
    List<Movie> findAll();
}
