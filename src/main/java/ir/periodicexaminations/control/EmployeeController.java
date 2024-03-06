package ir.periodicexaminations.control;

import ir.periodicexaminations.model.repository.entities.Employee;
import ir.periodicexaminations.services.EmployeeService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(value = "/list")
    List<Employee> getEmployeesList() {
        return employeeService.listEmployee();
    }

    @GetMapping(value = "/test")
    @ResponseBody
    Page<Employee> getPageableEmployeeList(@RequestParam(defaultValue = "3",required = false) int pageSize, @RequestParam(defaultValue = "0",required = false) int pageNum) {
        if (pageSize > 50)
            pageSize = 10;
        PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
        return employeeService.listPageableEmployee(pageRequest);
    }


    @GetMapping(value = "/pagelist")
    public String getPageableEmployeeList(@RequestParam PageRequest pageRequest ) {
        System.out.println("pageable.getPageNumber()");
        return "hello";

    }
}
