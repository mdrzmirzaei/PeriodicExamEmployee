package ir.periodicexaminations.control.controllers;


import ir.periodicexaminations.control.services.EmployeeService;
import ir.periodicexaminations.model.EmployeeDao;
import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.repository.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employees")
public class EmployeeController implements Serializable {


    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/list")
    List<EmployeeDao> getEmployeeList() {
        return employeeService.showEmployees();
    }


    @PostMapping(value = "/all")
    Page<Employee> allEmployees() {
        return employeeService.findall_forME();
    }


    @GetMapping(value = "/my")
    Page<Employee> myEmp() {
        return employeeService.findall_forME();
    }
}
