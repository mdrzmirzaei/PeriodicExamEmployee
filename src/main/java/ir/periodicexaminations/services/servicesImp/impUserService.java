package ir.periodicexaminations.services.servicesImp;

import ir.periodicexaminations.model.repository.entities.User;
import ir.periodicexaminations.model.repository.entitiesDTOs.UserDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface impUserService {

    List<UserDto> showAllUsers();
    List<UserDto> showPageableUsers(Pageable pageable);
    Long usersCount();

}
