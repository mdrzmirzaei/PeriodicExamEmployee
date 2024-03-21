package ir.periodicexaminations.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bloodExams")
public class BloodExam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bexamId;
    @Temporal(TemporalType.DATE)
    private java.util.Date dateExamination;
    private int rbc;
    private int wbc;
    private int hemoglobin;
    private float platelets;
    private int fbs;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
}
