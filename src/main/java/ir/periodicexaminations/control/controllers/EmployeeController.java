package ir.periodicexaminations.control.controllers;


import ir.periodicexaminations.control.services.EmployeeService;
import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.repository.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employees")
public class EmployeeController {


    private final EmployeeRepository employeeRepository;
    public List<Employee> employeeList;


    @PostMapping(value = "/list")
    List<Employee> getEmployeeList() {
        EmployeeService es = new EmployeeService(employeeRepository);
        employeeList=es.showEmployees();
        return employeeList;
    }
}
