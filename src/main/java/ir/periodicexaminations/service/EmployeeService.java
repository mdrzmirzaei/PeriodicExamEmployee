package ir.periodicexaminations.service;

import ir.periodicexaminations.model.entities.Employee;
import ir.periodicexaminations.model.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> listEmployee() {
        return employeeRepository.findAll();
    }

    public Page<Employee> listPageableEmployee(PageRequest pageableDTO) {
        return employeeRepository.findAll(PageRequest.of(pageableDTO.getPageNumber(), pageableDTO.getPageSize(), pageableDTO.getSort()));
    }

    public Optional<Employee> findEmployee(Long empId) {
        return employeeRepository.findById(empId);
    }
}