package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class RoleMovesLeftEvent {
    private int roleId;
    private int roleX;
}
