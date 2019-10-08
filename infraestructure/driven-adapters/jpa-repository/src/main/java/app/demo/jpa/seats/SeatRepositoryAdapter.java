package app.demo.jpa.seats;

import app.demo.domain.seats.Seat;
import app.demo.domain.seats.gateways.SeatRepository;
import app.demo.jpa.adapter.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeatRepositoryAdapter extends AdapterOperations<Seat, SeatData, String, SeatDataRepository>
    implements SeatRepository {

    @Autowired
    public SeatRepositoryAdapter(SeatDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Seat.SeatBuilder.class).build());
    }

    @Override
    public void saveAll(List<Seat> seats) {
        super.saveAllEntities(seats);
    }

    @Override
    public List<Seat> finAllByMovieId(Seat seat) {
        return super.findByExample(seat);
    }
}
