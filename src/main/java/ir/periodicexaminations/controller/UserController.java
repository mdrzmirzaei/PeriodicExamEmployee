package ir.periodicexaminations.controller;

import ir.periodicexaminations.model.entities.User;
import ir.periodicexaminations.service.UserService;
import ir.periodicexaminations.utils.CustomPageRequestDto;
import jakarta.validation.Valid;
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

    @GetMapping(value = "/list")
    public Page<User> userPageableList(@Valid @RequestBody CustomPageRequestDto<User> userCustomPageRequestDto) throws Exception
    {
        return userService.userPageableList(userCustomPageRequestDto.getPageRequest(User.class));
    }


}
