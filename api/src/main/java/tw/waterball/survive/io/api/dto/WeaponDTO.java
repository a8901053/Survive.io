package tw.waterball.survive.io.api.dto;

import lombok.Data;

@Data
public class WeaponDTO {
    private String weaponName;
    private int holderId;
    private int damage;
    private boolean isOnTheGround;
}
