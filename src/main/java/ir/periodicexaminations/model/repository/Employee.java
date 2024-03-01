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
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Long empId;
    private String empName;
    private String empFamily;
    private String nationalCode;


    public Employee(String empName, String empFamily, String nationalCode) {
        this.empName = empName;
        this.empFamily = empFamily;
        this.nationalCode = nationalCode;
    }

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "emp_id")
    private Set<Exam> exams = new HashSet<>();


    // todo: deal for cascade in JPA

}