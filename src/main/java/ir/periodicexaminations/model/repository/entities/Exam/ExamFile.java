package ir.periodicexaminations.model.repository.entities.Exam;

import ir.periodicexaminations.model.repository.entities.Employee;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ExamFile")
@Data
@RequiredArgsConstructor
public class ExamFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examFileId;
    private int year;

    @OneToMany(mappedBy = "bExamFileId")
    Set<BloodExam> bloodExams = new HashSet<>();
    @OneToMany(mappedBy = "vExamFileId")
    Set<VisionExam> visionExams = new HashSet<>();
    @OneToMany(mappedBy = "hExamFileId")
    Set<HearingExam> hearingExams = new HashSet<>();


    @ManyToOne
    private Employee employee;

    public void setYear(int year) {
        if (year > 1390 & year < 2500)
            this.year = year;
        else this.year = Integer.parseInt(String.valueOf(year).substring(0, 4));

    }
}
