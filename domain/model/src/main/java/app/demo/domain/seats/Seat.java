package app.demo.domain.seats;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class Seat {

    public enum Rows {
        A, B, C, D, E, F, G
    }

    private final String id;
    private final String movieId;
    private final Rows row;
    private final int column;
    private final String cinema;
    private final Date bookingDate;

}
