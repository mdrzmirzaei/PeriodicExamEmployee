package ir.periodicexaminations.services.servicesImp;

import ir.periodicexaminations.model.repository.entitiesDTOs.BloodExamDto;
import ir.periodicexaminations.model.repository.entitiesDTOs.EmployeeDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface impBloodExamService {

    List<BloodExamDto> showAllBloodExam();
    List<BloodExamDto> showPageableBloodExam(Pageable pageable);
    Long bloodExamsCount();
}
