package ir.periodicexaminations.model.repository.entitiesDTOs;

import ir.periodicexaminations.model.repository.entities.Exam.BloodExam;
import ir.periodicexaminations.model.repository.entities.Exam.ExamFile;
import ir.periodicexaminations.model.repository.entities.Exam.HearingExam;
import ir.periodicexaminations.model.repository.entities.Exam.VisionExam;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ExamFileDto {

    private Long examFileId;
    private int year;

    Set<BloodExam> bloodExams = new HashSet<>();
    Set<VisionExam> visionExams = new HashSet<>();
    Set<HearingExam> hearingExams = new HashSet<>();

    public ExamFileDto(ExamFile examFile) {
        this.examFileId = examFile.getExamFileId();
        this.year = examFile.getYear();
        this.bloodExams = examFile.getBloodExams();
        this.visionExams = examFile.getVisionExams();
        this.hearingExams = examFile.getHearingExams();
    }
}
