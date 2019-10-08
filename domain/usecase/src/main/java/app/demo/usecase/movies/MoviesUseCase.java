package app.demo.usecase.movies;

import app.demo.domain.movies.Movie;
import app.demo.domain.movies.gateways.MovieRepository;
import app.demo.domain.technicalogs.gateways.ILogger;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MoviesUseCase {

    private final MovieRepository repository;
    private final ILogger logger;

    public List<Movie> getMovies() {
        List<Movie> list = new ArrayList<Movie>();
        try {
            list = repository.findAll();
        } catch (Exception ex) {
            logger.Error("Obteniendo Peliculas", ex);
        } finally {
            return list;
        }
    }

    public void addMovie(String title, String categorie) {
        try {
            Movie.Categories movieCategory = Movie.Categories.valueOf(categorie);
            Movie movie = Movie.builder().title(title).category(movieCategory).build();

            repository.save(movie);
        } catch (Exception ex) {
            logger.Error("Creando movie", ex);
        }
    }
}
