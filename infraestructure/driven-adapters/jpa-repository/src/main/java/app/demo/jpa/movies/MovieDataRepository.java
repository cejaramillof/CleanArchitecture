package app.demo.jpa.movies;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface MovieDataRepository extends CrudRepository<MovieData, String>, QueryByExampleExecutor<MovieData> {
}
