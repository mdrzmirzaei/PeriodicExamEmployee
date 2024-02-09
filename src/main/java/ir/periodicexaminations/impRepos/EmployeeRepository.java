package ir.periodicexaminations.impRepos;

import ir.periodicexaminations.repository.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
