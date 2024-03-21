package ir.periodicexaminations.controller;

import ir.periodicexaminations.model.entities.User;
import ir.periodicexaminations.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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
