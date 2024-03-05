package ir.periodicexaminations.services;

import ir.periodicexaminations.model.implementRepositories.UserRepository;
import ir.periodicexaminations.model.repository.entities.User;
import ir.periodicexaminations.model.repository.entitiesDTOs.UserDto;
import ir.periodicexaminations.services.servicesImp.impUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements impUserService {
    @Autowired
    UserRepository userRepository;

    List<UserDto> userDtoList = new ArrayList<UserDto>();

    @Override
    public List<UserDto> showAllUsers() {
        userDtoList.clear();
        userRepository.findAll().forEach(user -> userDtoList.add(new UserDto(user)));
        return userDtoList;
    }

    @Override
    public List<UserDto> showPageableUsers(Pageable pageable) {
        userDtoList.clear();
        userRepository.findAll(pageable).forEach(user -> userDtoList.add(new UserDto(user)));
        return userDtoList;
    }

    @Override
    public Long usersCount() {
        return userRepository.count();
    }
}
