package app.repos;

import app.model.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alvin
 **/
@Repository
public interface TrackRepos extends MongoRepository<Track, Long> {

    Track findByName(String name);
}
