package app.demo.config;

import app.demo.domain.movies.gateways.MovieRepository;
import app.demo.domain.technicalogs.gateways.ILogger;
import app.demo.usecase.movies.MoviesUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public MoviesUseCase createMoviesUseCase(MovieRepository repository, ILogger logger) {
        return new MoviesUseCase(repository, logger);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapperImp();
    }

}

