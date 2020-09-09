package tw.waterball.survive.io.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {
    private String name;
    private int money;
    private int speed;
    private int def;
    private int hp;
    private int maxHp;
    private List<WeaponSlotDTO> weaponSlotDTOs;
    private List<MagazineDTO> magazineDTOs;
    private WeaponSlotDTO currentWeaponSlotDTO;
}
