package tw.waterball.survive.io.api.dto.request;

import lombok.Data;

@Data
public class PickUpWeaponRequest {
    private int playerId;
    private int weaponId;
}
