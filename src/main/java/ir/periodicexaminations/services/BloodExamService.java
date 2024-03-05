package ir.periodicexaminations.services;

import ir.periodicexaminations.model.implementRepositories.ExamRepository;
import ir.periodicexaminations.model.repository.entitiesDTOs.BloodExamDto;
import ir.periodicexaminations.services.servicesImp.impBloodExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BloodExamService implements impBloodExamService {
    private ExamRepository examRepository;

    List<BloodExamDto> bloodExamDtoList = new ArrayList<>();

    @Autowired
    public void setBloodExamRepository(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Override
    public List<BloodExamDto> showAllBloodExam() {
        bloodExamDtoList.clear();
        examRepository.findAll().forEach(bloodExam -> bloodExamDtoList.add(new BloodExamDto(bloodExam)));
        return bloodExamDtoList;
    }

    @Override
    public List<BloodExamDto> showPageableBloodExam(Pageable pageable) {
        bloodExamDtoList.clear();
        examRepository.findAll(pageable).forEach(bloodExam -> bloodExamDtoList.add(new BloodExamDto(bloodExam)));
        return bloodExamDtoList;
    }

    @Override
    public Long bloodExamsCount() {
        return examRepository.count();
    }
}
