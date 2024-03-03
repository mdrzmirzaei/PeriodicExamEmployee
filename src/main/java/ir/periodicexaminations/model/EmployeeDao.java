package ir.periodicexaminations.model;

import lombok.Data;


@Data
public class EmployeeDao {

     String DempName;
     String DempFamily;
     String DnationalCode;


    public EmployeeDao(String dempName, String dempFamily, String dnationalCode) {
        DempName = dempName;
        DempFamily = dempFamily;
        DnationalCode = dnationalCode;
    }
}