package ir.periodicexaminations.model.repository.entitiesDTOs;

import ir.periodicexaminations.model.repository.entities.Exam;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class BloodExamDto {
    private Long examId;
    private Timestamp dateExamination;
    private int cbc;
    private int wbc;
    private int hemoglobin;

    public BloodExamDto(Exam exam) {
        this.examId = exam.getExamId();
        this.dateExamination = exam.getDateExamination();
        this.cbc = exam.getCbc();
        this.wbc = exam.getWbc();
        this.hemoglobin = exam.getHemoglobin();
    }
}
