package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
