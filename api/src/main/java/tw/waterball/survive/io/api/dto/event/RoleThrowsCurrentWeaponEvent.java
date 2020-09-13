package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class RoleThrowsCurrentWeaponEvent {
    private int roleId;
    private int weaponId;
}
