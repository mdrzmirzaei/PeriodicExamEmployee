package ir.periodicexaminations.control.controllers;

import ir.periodicexaminations.model.repository.entitiesDTOs.EmployeeDto;
import ir.periodicexaminations.model.repository.entitiesDTOs.UserDto;
import ir.periodicexaminations.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController implements Serializable {

    private UserService userService;
    Pageable pageable = null;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/lista")
    List<UserDto> getUsersList() {
        return userService.showAllUsers();
    }

    @GetMapping(value = "/listp")
    @ResponseBody
    List<UserDto> getUsersPageableList(@RequestParam(defaultValue = "0", required = false) int pageNumber, @RequestParam(defaultValue = "4", required = false) int pageSize) {
        if (pageSize > 50)
            pageSize = 10;
        pageable = PageRequest.of(pageNumber, pageSize);

        return userService.showPageableUsers(pageable);
    }
}
