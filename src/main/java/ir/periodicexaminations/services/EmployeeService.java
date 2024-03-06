package ir.periodicexaminations.services;

import ir.periodicexaminations.model.repository.entities.Employee;
import ir.periodicexaminations.model.implementRepositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> listEmployee() {
        return employeeRepository.findAll();
    }

    public Page<Employee> listPageableEmployee(PageRequest pageRequest) {
        return employeeRepository.findAll(pageRequest);
    }


    public Long countEmployee() {
        return employeeRepository.count();
    }
}