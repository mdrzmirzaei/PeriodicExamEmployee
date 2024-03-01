package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.repository.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

@Query(value = "select * from employees",nativeQuery = true)
List<Employee> list();

    @Override
    List<Employee> findAll();
}
