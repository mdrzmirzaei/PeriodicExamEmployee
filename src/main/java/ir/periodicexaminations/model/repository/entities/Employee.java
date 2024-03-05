package ir.periodicexaminations.model.repository.entities;

import ir.periodicexaminations.model.repository.entities.Exam.ExamFile;
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
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
    private String empFamily;
    private String nationalCode;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "employee")
    private Set<ExamFile> exams = new HashSet<ir.periodicexaminations.model.repository.entities.Exam.ExamFile>();


    // todo: deal for cascade in JPA

}