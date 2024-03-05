package ir.periodicexaminations.control.controllers;

import ir.periodicexaminations.model.repository.entitiesDTOs.ExamFileDto;
import ir.periodicexaminations.services.ExamFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/bloodexams")
public class ExamController implements Serializable {
    private ExamFileService bloodExamService;

    Pageable pageable = null;

    public void setBloodExamService(ExamFileService bloodExamService) {
        this.bloodExamService = bloodExamService;
    }

    @PostMapping("/lista")
    List<ExamFileDto> getBloodExamsList() {
        return bloodExamService.showAllExamFile();
    }

    @GetMapping(value = "/listp")
    List<ExamFileDto> getBloodExamsPageableList(@RequestParam(defaultValue = "0", required = false) int pageNumber, @RequestParam(defaultValue = "5", required = false) int pageSize) {
        if (pageSize > 50)
            pageSize = 10;
        pageable = PageRequest.of(pageNumber, pageSize);
         return bloodExamService.showPageableExamFile(pageable);
    }


}
