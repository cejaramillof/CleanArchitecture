package app.demo.api.rest.movie;

import app.demo.usecase.movies.MoviesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/movies", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MoviesService {

    private final MoviesUseCase useCase;

    @GetMapping
    public List<app.demo.domain.movies.Movie> getMovies() {
        return useCase.getMovies();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/add")
    public void addMovie(@RequestBody app.demo.api.rest.movie.Movie data) {
        useCase.addMovie(data.getTitle(), data.getCategory().name());
    }
}
