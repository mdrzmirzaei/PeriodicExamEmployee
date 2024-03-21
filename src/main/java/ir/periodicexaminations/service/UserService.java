package ir.periodicexaminations.service;

import ir.periodicexaminations.model.repository.UserRepository;
import ir.periodicexaminations.model.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

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
}
