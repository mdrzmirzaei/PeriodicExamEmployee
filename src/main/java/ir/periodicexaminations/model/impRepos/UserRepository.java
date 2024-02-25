package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
