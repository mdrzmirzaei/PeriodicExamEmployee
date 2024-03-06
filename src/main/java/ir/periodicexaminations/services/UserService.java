package ir.periodicexaminations.services;

import ir.periodicexaminations.model.implementRepositories.UserRepository;
import ir.periodicexaminations.model.repository.entities.User;
import ir.periodicexaminations.model.repository.entitiesDTOs.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> userList() {
        return userRepository.findAll();
    }
    public Page<User> userPageableList(PageRequest pageRequest) {
        return userRepository.findAll(pageRequest);
    }


    public Long usersCount() {
        return userRepository.count();
    }
}
