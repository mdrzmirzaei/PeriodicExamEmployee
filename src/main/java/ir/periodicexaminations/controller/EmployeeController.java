package ir.periodicexaminations.controller;

import com.google.gson.Gson;
import ir.periodicexaminations.model.entities.Employee;
import ir.periodicexaminations.service.EmployeeService;
import ir.periodicexaminations.service.util.PageableDTO;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(value = "/list")
    List<Employee> listEmployee() {
        return employeeService.listEmployee();
    }



    /*
    @GetMapping(value = "/test")
    @ResponseBody
    Page<Employee> getPageableEmployeeList(@RequestParam(defaultValue = "3",required = false) int pageSize, @RequestParam(defaultValue = "0",required = false) int pageNum) {
        if (pageSize > 50)
            pageSize = 10;
        PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
        return employeeService.listPageableEmployee(pageRequest);
    }
    */


    @PostMapping(value = "/test")
    public /*Page<Employee>*/ String listPageableEmployee(@RequestBody PageableDTO pDTo) {
        var pd = new PageableDTO(3, 0, "empFamily", Sort.Direction.ASC.toString());
        Gson gson = new Gson();
        System.out.println(gson.toJson(pd));
        System.out.println(pd);

        Page<Employee>pe= employeeService.listPageableEmployee(pDTo);
pe.forEach(employee -> System.out.println(employee.getEmpFamily()));
        System.out.println(gson.toJson(pDTo));
        System.out.println(pDTo.toString());
        //System.out.println(gson.toJson(pageableDTO));

        return pd.toString();
    }

}
