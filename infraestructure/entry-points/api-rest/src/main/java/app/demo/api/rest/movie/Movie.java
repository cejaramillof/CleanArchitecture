package app.demo.api.rest.movie;

import lombok.Data;

@Data
public class Movie {

    public enum Categories {
        ACTION,
        ADVENTURE,
        COMEDY,
        DRAMA
    }

    private String id;

    private String title;

    private Categories category;
}
