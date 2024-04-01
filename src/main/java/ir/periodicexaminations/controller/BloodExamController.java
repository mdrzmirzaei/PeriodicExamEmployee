package ir.periodicexaminations.controller;

import ir.periodicexaminations.model.entities.BloodExam;
import ir.periodicexaminations.service.BloodExamService;
import ir.periodicexaminations.utils.CustomPageRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/bloodexam")
public class BloodExamController {

    private final BloodExamService bloodExamService;
    PageRequest pageRequest = null;

    @GetMapping(value = "list")
    public Page<BloodExam> bloodExamPageableList(@Valid @RequestBody CustomPageRequestDto<BloodExam> bloodExamCustomPageRequestDto) throws Exception {
        if (bloodExamCustomPageRequestDto.getSort()==null);
        bloodExamCustomPageRequestDto.setSort("bexamId", "ASC");
        return bloodExamService.bloodExamPageableList(bloodExamCustomPageRequestDto.getEmpId(), bloodExamCustomPageRequestDto.getPageRequest(BloodExam.class));
    }
}
