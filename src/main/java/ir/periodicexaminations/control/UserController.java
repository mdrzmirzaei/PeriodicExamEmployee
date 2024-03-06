package ir.periodicexaminations.control;

import ir.periodicexaminations.model.repository.entities.User;
import ir.periodicexaminations.model.repository.entitiesDTOs.EmployeeDto;
import ir.periodicexaminations.model.repository.entitiesDTOs.UserDto;
import ir.periodicexaminations.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;
    PageRequest pageRequest = null;

    @PostMapping(value = "/list")
    List<User> getUsersList() {
        return userService.userList();
    }

    @GetMapping(value = "/listPageable")
    @ResponseBody
    Page<User> getUsersPageableList(@RequestParam(defaultValue = "0", required = false) int pageNumber, @RequestParam(defaultValue = "4", required = false) int pageSize) {
        if (pageSize > 50)
            pageSize = 10;
        pageRequest = PageRequest.of(pageNumber, pageSize);

        return userService.userPageableList(pageRequest);
    }
}
