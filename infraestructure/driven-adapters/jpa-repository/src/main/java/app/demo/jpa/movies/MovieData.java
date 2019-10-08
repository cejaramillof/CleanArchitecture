package app.demo.jpa.movies;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Movies")
@NoArgsConstructor
public class MovieData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title", length = 500, nullable = false)
    private String title;

    @Column(name = "Category", length = 50, nullable = false)
    @Enumerated(EnumType.STRING)
    private Categories category;

    public enum Categories {
        ACTION,
        ADVENTURE,
        COMEDY,
        DRAMA
    }
}
