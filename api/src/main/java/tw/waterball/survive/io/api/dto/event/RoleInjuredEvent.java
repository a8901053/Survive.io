package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class RoleInjuredEvent {
    private int roleId;
    private int damage;
}
