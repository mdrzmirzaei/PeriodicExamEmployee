package ir.periodicexaminations.control.controllers;

import ir.periodicexaminations.model.repository.entitiesDTOs.BloodExamDto;
import ir.periodicexaminations.services.BloodExamService;
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
    private BloodExamService bloodExamService;

    Pageable pageable = null;

    public void setBloodExamService(BloodExamService bloodExamService) {
        this.bloodExamService = bloodExamService;
    }

    @PostMapping("/lista")
    List<BloodExamDto> getBloodExamsList() {
        return bloodExamService.showAllBloodExam();
    }

    @GetMapping(value = "/listp")
    List<BloodExamDto> getBloodExamsPageableList(@RequestParam(defaultValue = "0", required = false) int pageNumber, @RequestParam(defaultValue = "5", required = false) int pageSize) {
        if (pageSize > 50)
            pageSize = 10;
        pageable = PageRequest.of(pageNumber, pageSize);
         return bloodExamService.showPageableBloodExam(pageable);
    }


}
