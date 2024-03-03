package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.EmployeeDao;
import ir.periodicexaminations.model.repository.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, PagingAndSortingRepository<Employee, Long> {


    @Query(value = "select * from employees", nativeQuery = true)
    List<Employee> list();

    @Override
    List<Employee> findAll();

    @Override
    Page<Employee> findAll(Pageable pageable);

}

