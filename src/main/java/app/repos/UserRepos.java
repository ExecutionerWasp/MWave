package app.repos;

import app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alvin
 **/
@Repository
public interface UserRepos extends MongoRepository<User, String> {

}
