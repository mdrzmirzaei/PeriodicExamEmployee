package ir.periodicexaminations.model.impRepos;

import ir.periodicexaminations.model.EmployeeDao;
import ir.periodicexaminations.model.repository.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface empService {

    List<EmployeeDao> showEmployees();

    Page<Employee> findall_forME();

}
