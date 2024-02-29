package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

@Query(value = "SELECT * from employees", nativeQuery = true)
    List<Employee> showall();
}
