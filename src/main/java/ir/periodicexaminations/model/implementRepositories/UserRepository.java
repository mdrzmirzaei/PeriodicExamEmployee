package ir.periodicexaminations.model.implementRepositories;

import ir.periodicexaminations.model.repository.entities.Employee;
import ir.periodicexaminations.model.repository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
