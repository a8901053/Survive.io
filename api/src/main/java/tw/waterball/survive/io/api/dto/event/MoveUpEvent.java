package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class MoveUpEvent {
    private int roleId;
    private int roleY;
}
