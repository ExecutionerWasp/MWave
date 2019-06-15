package app.repos;

import app.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alvin
 **/
@Repository
public interface TrackRepos extends MongoRepository<Track, Long> {

    Track findByName(String name);
}
