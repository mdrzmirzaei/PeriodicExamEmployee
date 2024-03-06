package ir.periodicexaminations.services;

import ir.periodicexaminations.model.implementRepositories.BloodExamRepository;
import ir.periodicexaminations.model.repository.entities.BloodExam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodExamService {


    private final BloodExamRepository bloodExamRepository;

    public BloodExamService(BloodExamRepository bloodExamRepository) {
        this.bloodExamRepository = bloodExamRepository;
    }

    public List<BloodExam> bloodExamList() {

        return bloodExamRepository.findAll();
    }


    public Page<BloodExam> bloodExamPageableList(PageRequest pageRequest) {

        return bloodExamRepository.findAll(pageRequest);
    }
    public Long ExamFilesCount() {
        return bloodExamRepository.count();
    }

}
