package ir.periodicexaminations.impRepos;

import ir.periodicexaminations.repository.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
