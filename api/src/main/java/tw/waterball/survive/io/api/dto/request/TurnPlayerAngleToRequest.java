package tw.waterball.survive.io.api.dto.request;

import lombok.Data;

@Data
public class TurnPlayerAngleToRequest {
    private int playerId;
    private float angle;
}
