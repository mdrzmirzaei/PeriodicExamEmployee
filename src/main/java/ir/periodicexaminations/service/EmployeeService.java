package ir.periodicexaminations.service;

import ir.periodicexaminations.model.entities.Employee;
import ir.periodicexaminations.model.repository.EmployeeRepository;
import ir.periodicexaminations.service.util.PageableDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> listEmployee() {
        return employeeRepository.findAll();
    }

    public Page<Employee> listPageableEmployee(PageableDTO pageableDTO) {
        return employeeRepository.findAll(PageRequest.of(pageableDTO.getPageNumber(), pageableDTO.getPageSize(), Sort.Direction.fromString(pageableDTO.getSortDirection()),pageableDTO.getSortBy()));
    }

}