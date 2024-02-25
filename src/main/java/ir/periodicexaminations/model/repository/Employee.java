package ir.periodicexaminations.model.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
    private String empFamily;
    private String nationalCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id", referencedColumnName = "userId")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private Set<Exam> exams = new HashSet<>();

}