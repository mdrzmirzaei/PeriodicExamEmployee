package ir.periodicexaminations.model.entitiesDTO;

import ir.periodicexaminations.model.entities.Employee;
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