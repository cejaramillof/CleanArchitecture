package app.demo.defaults;

import app.demo.domain.movies.Movie;
import app.demo.domain.movies.gateways.MovieRepository;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DefaultBeansConfig {

    /*
    @Bean
    @ConditionalOnMissingBean
    public MovieRepository movieRepository() {
        System.out.println("Bean MovieRepository $$$$$$$");
        return movieRepository;
    }
    */


    private final MovieRepository movieRepository = new MovieRepository() {
        @Override
        public Movie save(Movie movie) {
            return movie;
        }

        @Override
        public void saveAll(List<Movie> movies) {

        }

        @Override
        public Movie findById(String id) {
            return null;
        }

        @Override
        public List<Movie> findAll() {
            return null;
        }
    };


}
