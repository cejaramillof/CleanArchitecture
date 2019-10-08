package app.demo.jpa.seats;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class SeatData {
    public enum Rows {
        A, B, C, D, E, F, G
    }

    @Id
    private String id;
    private String movieId;
    private Rows row;
    private int column;
    private String cinema;
    private Date bookingDate;
}
