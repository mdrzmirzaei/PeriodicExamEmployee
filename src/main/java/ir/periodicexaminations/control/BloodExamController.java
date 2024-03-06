package ir.periodicexaminations.control;

import ir.periodicexaminations.model.repository.entities.BloodExam;
import ir.periodicexaminations.services.BloodExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/bloodexams")
public class BloodExamController {

    private final BloodExamService bloodExamService;
    PageRequest pageRequest = null;

    @PostMapping("/lista")
    List<BloodExam> bloodExamList() {
        return bloodExamService.bloodExamList();
    }

    @GetMapping(value = "/listp")
    Page<BloodExam> bloodExamPageableList(@RequestParam(defaultValue = "0", required = false) int pageNumber, @RequestParam(defaultValue = "5", required = false) int pageSize) {
        if (pageSize > 50)
            pageSize = 10;
        pageRequest = PageRequest.of(pageNumber, pageSize);
        return bloodExamService.bloodExamPageableList(pageRequest);
    }

}
