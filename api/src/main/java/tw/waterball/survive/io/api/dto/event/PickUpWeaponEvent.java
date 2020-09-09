package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class PickUpWeaponEvent {
    private int roleId;
    private int weaponId;
}
