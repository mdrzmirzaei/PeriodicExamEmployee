package ir.periodicexaminations.controller;

import ir.periodicexaminations.exceptions.EmployeeNotFoundException;
import ir.periodicexaminations.model.entities.Employee;
import ir.periodicexaminations.service.EmployeeService;
import ir.periodicexaminations.utils.CustomPageRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/mytest")
    public CustomPageRequestDto pp(){
        HashMap<String,String> hm= new HashMap<>();
        hm.put("empName","ASC");
        CustomPageRequestDto<Employee> cc=new CustomPageRequestDto<Employee>(3,5,hm,3l);
        return cc;
    }


    @GetMapping(value = "/pagelist")
    public Page<Employee> pageableEmployeeList(@Valid @RequestBody CustomPageRequestDto<Employee> dto) throws Exception {
        if (employeeService.listEmployee().isEmpty())
            throw new EmployeeNotFoundException();
        return employeeService.listPageableEmployee(dto.getPageRequest(Employee.class));
    }

    @GetMapping(value = "/find")
    public Optional<Employee> findEmployee(@RequestBody Employee employee) {
        if (employeeService.findEmployee(employee.getEmpId()).isEmpty())
            throw new EmployeeNotFoundException();
        return employeeService.findEmployee(employee.getEmpId());
    }
}
