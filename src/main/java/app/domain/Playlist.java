package app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

/**
 * @author Alvin
 **/
@Entity
@Document(collection = "playlist")
@Data
@NoArgsConstructor
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @JoinColumn(name = "track_id")
    @OneToMany(fetch = FetchType.EAGER)
    private List<Track> tracks;
}
