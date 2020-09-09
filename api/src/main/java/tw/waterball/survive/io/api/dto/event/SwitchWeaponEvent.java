package tw.waterball.survive.io.api.dto.event;

import lombok.Data;

@Data
public class SwitchWeaponEvent {
    private int roleId;
    private int weaponSlotIndex;
}
