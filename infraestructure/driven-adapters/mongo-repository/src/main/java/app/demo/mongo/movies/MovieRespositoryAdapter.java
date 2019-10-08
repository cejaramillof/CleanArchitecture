package app.demo.mongo.movies;

import app.demo.domain.movies.Movie;
import app.demo.domain.movies.gateways.MovieRepository;
import app.demo.mong.adapter.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRespositoryAdapter extends AdapterOperations<Movie, MovieData, String, MovieDataRepository> implements MovieRepository {

    @Autowired
    public MovieRespositoryAdapter(MovieDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Movie.MovieBuilder.class).build());
    }

    @Override
    public void saveAll(List<Movie> movies) {
        super.saveAllEntities(movies);
    }
}
