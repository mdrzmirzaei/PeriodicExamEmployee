package ir.periodicexaminations.controller;

import ir.periodicexaminations.exceptions.EmployeeNotFoundException;
import ir.periodicexaminations.model.entities.Employee;
import ir.periodicexaminations.service.EmployeeService;
import ir.periodicexaminations.utils.CustomPageRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/pagelist")
    public Page<Employee> pageableEmployeeList(@Valid @RequestBody CustomPageRequestDto<Employee> dto) throws Exception {
        if (employeeService.listEmployee().isEmpty())
            throw  new EmployeeNotFoundException();
        return employeeService.listPageableEmployee(dto.getPageRequest(Employee.class));
    }


    @GetMapping(value = "/find")
    public Optional<Employee> findEmployee(@RequestBody Employee employee) throws Exception {
        if (employeeService.findEmployee(employee.getEmpId()).isEmpty())
            throw  new EmployeeNotFoundException();
        return employeeService.findEmployee(employee.getEmpId());
    }
}
