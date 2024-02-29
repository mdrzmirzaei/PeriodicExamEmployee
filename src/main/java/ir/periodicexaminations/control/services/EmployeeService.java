package ir.periodicexaminations.control.services;

import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.repository.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {
    
    public static List<Employee> employees;
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository=employeeRepository;
    }

    public List<Employee> showEmployees() {
        //employeeRepository.showall().forEach(employee -> System.out.println(employee.getEmpFamily() + "   " + employee.getEmpName() + "  " + employee.getNationalCode()));
           employees=employeeRepository.showall();
         return employeeRepository.showall();
    }

}