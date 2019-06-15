package app.repos;

import app.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alvin
 **/
@Repository
public interface UserRepos extends MongoRepository<User, String> {

}
