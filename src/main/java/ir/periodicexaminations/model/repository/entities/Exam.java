package ir.periodicexaminations.model.repository.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examId;
    private static KindOfExam KindOfExam;
    private Timestamp dateExamination;
    private int cbc;
    private int wbc;
    private int hemoglobin;
    private float rightHearingExam;
    private float leftHearingExam;
    private float rightVisionExam;
    private float leftVisionExam;


    @ManyToOne
    private Employee employee;

    public enum KindOfExam {
        BloodExam,
        visionExam,
        HearingExam,

    }

    public Exam(Exam.KindOfExam kindOfExam, Timestamp dateExamination, float right, float left) {
        if (kindOfExam.equals(Exam.KindOfExam.HearingExam)) {
            KindOfExam = kindOfExam;
            this.dateExamination = dateExamination;
            this.rightHearingExam = right;
            this.leftHearingExam = left;
        } else if (kindOfExam.equals(Exam.KindOfExam.visionExam)) {
            this.rightVisionExam = right;
            this.leftVisionExam = left;
        }
    }

    public Exam(Exam.KindOfExam kindOfExam, Timestamp dateExamination, int cbc, int wbc, int hemoglobin) {
        KindOfExam = kindOfExam;
        this.dateExamination = dateExamination;
        this.cbc = cbc;
        this.wbc = wbc;
        this.hemoglobin = hemoglobin;
    }

}
