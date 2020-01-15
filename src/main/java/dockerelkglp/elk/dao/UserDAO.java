package dockerelkglp.elk.dao;

import dockerelkglp.elk.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * An interface declaration in order to perform CRUD operations for {@link User} resource
 *
 * @author vlotar
 */
@Repository
public interface UserDAO extends CrudRepository<User, Long> {

}
