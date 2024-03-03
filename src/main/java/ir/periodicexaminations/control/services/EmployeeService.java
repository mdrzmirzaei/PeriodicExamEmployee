package ir.periodicexaminations.control.services;

import ir.periodicexaminations.model.EmployeeDao;
import ir.periodicexaminations.model.impRepos.EmployeeRepository;
import ir.periodicexaminations.model.impRepos.empService;
import ir.periodicexaminations.model.repository.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService implements empService {

    @Autowired
    private EmployeeRepository employeeRepository;
    Pageable getPages = PageRequest.of(0, 3);
    List<EmployeeDao> employeeList = new ArrayList<EmployeeDao>();


    public List<EmployeeDao> showEmployees() {
        //employeeRepository.showall().forEach(employee -> System.out.println(employee.getEmpFamily() + "   " + employee.getEmpName() + "  " + employee.getNationalCode()));


        employeeRepository.findAll().forEach(employee -> employeeList.add(new EmployeeDao(employee.getEmpName(), employee.getEmpFamily(), employee.getNationalCode())));

        return employeeList;
    }


    @Override
    public Page<Employee> findall_forME() {
        return employeeRepository.findAll(getPages);

    }
}