package ir.periodicexaminations.services.servicesImp;

import ir.periodicexaminations.model.repository.entitiesDTOs.ExamFileDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface impExamFileService {


    List<ExamFileDto> showAllExamFile();
    List<ExamFileDto> showPageableExamFile(Pageable pageable);
    Long ExamFilesCount();

}
