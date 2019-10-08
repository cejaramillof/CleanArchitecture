package app.demo.mongo.movies;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@Document(collection = "movies")
public class MovieData {

    @Id

    public String id;

    @Field("Title")
    private String title;

    @Field("Category")
    @Enumerated(EnumType.STRING)
    private Categories category;

    public enum Categories {
        ACTION,
        ADVENTURE,
        COMEDY,
        DRAMA
    }
}
