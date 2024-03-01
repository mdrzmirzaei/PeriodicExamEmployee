package ir.periodicexaminations.model;

import ir.periodicexaminations.model.repository.Exam;
import ir.periodicexaminations.model.repository.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class EmployeeDao implements Serializable {

     String DempName;
     String DempFamily;
     String DnationalCode;


    public EmployeeDao(String dempName, String dempFamily, String dnationalCode) {
        DempName = dempName;
        DempFamily = dempFamily;
        DnationalCode = dnationalCode;
    }
}