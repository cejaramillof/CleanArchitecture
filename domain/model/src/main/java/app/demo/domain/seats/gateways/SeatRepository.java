package app.demo.domain.seats.gateways;

import app.demo.domain.seats.Seat;

import java.util.List;

public interface SeatRepository {

    Seat save(Seat seat);

    void saveAll(List<Seat> seats);

    Seat findById(String id);

    List<Seat> findAll();

    List<Seat> finAllByMovieId(Seat seat);
}
