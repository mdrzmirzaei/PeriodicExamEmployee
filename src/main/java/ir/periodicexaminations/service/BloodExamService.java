package ir.periodicexaminations.service;

import ir.periodicexaminations.model.repository.BloodExamRepository;
import ir.periodicexaminations.model.entities.BloodExam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
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

    public Page<BloodExam> bloodExamPageableList(Long empId, PageRequest pageRequest) {
        return new PageImpl<>(bloodExamRepository.findAll(pageRequest).stream().filter(bloodExam -> bloodExam.getEmployee().getEmpId().equals(empId)).toList());
    }
}