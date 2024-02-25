package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
