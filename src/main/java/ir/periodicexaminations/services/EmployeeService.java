package ir.periodicexaminations.services;

import ir.periodicexaminations.model.repository.entitiesDTOs.EmployeeDto;
import ir.periodicexaminations.model.implementRepositories.EmployeeRepository;
import ir.periodicexaminations.services.servicesImp.impEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService implements impEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    List<EmployeeDto> employeeList = new ArrayList<EmployeeDto>();


    public List<EmployeeDto> showAllEmployees() {
        employeeList.clear();
        employeeRepository.findAll().forEach(employee -> employeeList.add(new EmployeeDto(employee)));
        return employeeList;
    }


    @Override
    public List<EmployeeDto> showPageableEmployees(Pageable pageable) {
        employeeList.clear();
        employeeRepository.findAll(pageable).forEach(employee -> employeeList.add(new EmployeeDto(employee)));
        return employeeList;
    }

    @Override
    public Long employeesCount() {
        return employeeRepository.count();
    }
}