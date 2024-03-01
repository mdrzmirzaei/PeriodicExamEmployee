package ir.periodicexaminations.control.services;

import ir.periodicexaminations.model.EmployeeDao;
import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.repository.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    List<EmployeeDao> employeeList = new ArrayList<EmployeeDao>();

    public List<EmployeeDao> showEmployees() {
        //employeeRepository.showall().forEach(employee -> System.out.println(employee.getEmpFamily() + "   " + employee.getEmpName() + "  " + employee.getNationalCode()));



        employeeRepository.findAll().forEach(employee ->employeeList.add(new EmployeeDao(employee.getEmpName(), employee.getEmpFamily(), employee.getNationalCode())));

        return employeeList;


    }

}