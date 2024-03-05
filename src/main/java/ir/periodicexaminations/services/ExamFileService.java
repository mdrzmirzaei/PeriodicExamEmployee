package ir.periodicexaminations.services;

import ir.periodicexaminations.model.implementRepositories.examRepositories.ExamFileRepository;
import ir.periodicexaminations.model.repository.entitiesDTOs.ExamFileDto;
import ir.periodicexaminations.services.servicesImp.impExamFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamFileService implements impExamFileService{
    private ExamFileRepository examFileRepository;

    List<ExamFileDto> examFileDtoList = new ArrayList<>();

    @Autowired
    public ExamFileService(ExamFileRepository examFileRepository) {
        this.examFileRepository = examFileRepository;
    }

    @Override
    public List<ExamFileDto> showAllExamFile() {
        examFileDtoList.clear();
        examFileRepository.findAll().forEach(examFile -> examFileDtoList.add(new ExamFileDto(examFile)));
        return examFileDtoList;
    }

    @Override
    public List<ExamFileDto> showPageableExamFile(Pageable pageable) {
        examFileDtoList.clear();
        examFileRepository.findAll(pageable).forEach(examFile -> examFileDtoList.add(new ExamFileDto(examFile)));
        return examFileDtoList;
    }

    @Override
    public Long ExamFilesCount() {
        return examFileRepository.count();
    }

}
