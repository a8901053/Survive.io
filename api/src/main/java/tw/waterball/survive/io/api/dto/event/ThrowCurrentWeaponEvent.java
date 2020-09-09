package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class ThrowCurrentWeaponEvent {
    private int roleId;
    private int weaponId;
}
