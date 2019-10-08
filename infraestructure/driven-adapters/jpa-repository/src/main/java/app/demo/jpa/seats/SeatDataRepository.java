package app.demo.jpa.seats;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface SeatDataRepository extends CrudRepository<SeatData, String>, QueryByExampleExecutor<SeatData> {

}
