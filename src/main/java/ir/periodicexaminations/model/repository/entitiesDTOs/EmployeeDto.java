package ir.periodicexaminations.model.repository.entitiesDTOs;

import ir.periodicexaminations.model.repository.entities.Employee;
import lombok.Data;


@Data
public class EmployeeDto {

    Long DempId;
    String DempName;
    String DempFamily;
    String DnationalCode;


    public EmployeeDto(Employee employee) {
        this.DempId = employee.getEmpId();
        this.DempName = employee.getEmpName();
        this.DempFamily = employee.getEmpFamily();
        this.DnationalCode = employee.getNationalCode();
    }
}