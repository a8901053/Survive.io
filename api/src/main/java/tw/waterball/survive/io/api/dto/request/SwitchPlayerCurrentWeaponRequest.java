package tw.waterball.survive.io.api.dto.request;

import lombok.Data;

@Data
public class SwitchPlayerCurrentWeaponRequest {
    private int playerId;
    private int weaponSlotId;
}
