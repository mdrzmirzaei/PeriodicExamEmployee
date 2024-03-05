package ir.periodicexaminations.model.repository.entitiesDTOs;

import ir.periodicexaminations.model.repository.entities.User;
import lombok.Data;

@Data
public class UserDto {
    private Long DuserId;
    private String DuserName;

    public UserDto(User user) {
        DuserId = user.getUserId();
        DuserName = user.getUserName();
    }
}
