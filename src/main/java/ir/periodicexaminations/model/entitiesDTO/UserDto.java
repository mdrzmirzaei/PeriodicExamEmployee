package ir.periodicexaminations.model.entitiesDTO;

import ir.periodicexaminations.model.entities.User;
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
