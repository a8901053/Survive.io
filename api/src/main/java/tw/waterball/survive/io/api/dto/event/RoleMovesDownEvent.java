package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class RoleMovesDownEvent {
    private int roleId;
    private int roleY;
}
