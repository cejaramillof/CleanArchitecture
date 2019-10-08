package app.demo.mongo.movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface MovieDataRepository extends MongoRepository<MovieData, String> , QueryByExampleExecutor<MovieData> {
}
