package ir.periodicexaminations.services.servicesImp;

import ir.periodicexaminations.model.repository.entitiesDTOs.EmployeeDto;
import ir.periodicexaminations.model.repository.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface impEmployeeService {

    List<EmployeeDto> showAllEmployees();
    List<EmployeeDto> showPageableEmployees(Pageable pageable);
    Long employeesCount();

}
