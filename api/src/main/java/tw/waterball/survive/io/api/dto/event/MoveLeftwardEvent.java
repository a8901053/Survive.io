package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class MoveLeftwardEvent {
    private int roleId;
    private int roleX;
}
