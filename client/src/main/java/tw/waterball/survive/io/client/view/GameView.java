package tw.waterball.survive.io.client.view;


import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.game.sprite.Sprite;
import tw.waterball.survive.io.game.sprite.role.Role;
import tw.waterball.survive.io.game.sprite.weapon.Weapon;

import java.util.List;


public abstract class GameView {
    private State state;
    private PlayerController playerController;

    public abstract void launch();

    public abstract void onRender(List<Sprite> sprites);

    public abstract void onWeaponUsed(Weapon weapon);

    public abstract void onPlayerLoginSuccessfully();

    public abstract void onPlayerNameExists();

    public abstract void onNoBulletsToReload();

    public abstract void onMagazineIsFull();

    public abstract void onPickUpWeapon(Role role);

    public abstract void onThrowWeapon(Role role);

    public abstract void onInjured(Role role, int damage);

    public abstract void onSwitchCurrentWeapon(Role role);

    public abstract void onReload(Role role);

    public abstract void onDead(Role role);

    public abstract void onMove(Role role);

    public abstract void onTurn(Role role);
}