package ir.periodicexaminations.control.controllers;

import ir.periodicexaminations.services.EmployeeService;
import ir.periodicexaminations.model.repository.entitiesDTOs.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employees")
public class EmployeeController implements Serializable {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    Pageable pageable = null;

    @PostMapping(value = "/lista")
    List<EmployeeDto> getEmployeesList() {
        return employeeService.showAllEmployees();
    }

    @GetMapping(value = "/listp")
    @ResponseBody
    List<EmployeeDto> getPageableEmployeeList(@RequestParam(defaultValue = "0", required = false) int pageNumber, @RequestParam(defaultValue = "3", required = false) int pageSize) {
        if (pageSize > 50)
            pageSize = 10;
        pageable = PageRequest.of(pageNumber, pageSize);
        return employeeService.showPageableEmployees(pageable);
    }
}
