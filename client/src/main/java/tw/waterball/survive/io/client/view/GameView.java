package tw.waterball.survive.io.client.view;


import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.role.RoleSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSprite;


public abstract class GameView {
    private State state;
    private PlayerController playerController;

    public abstract void launch();

    public abstract void onRender(Sprite... sprites);

    public abstract void onWeaponUsed(WeaponSprite weaponSprite);

    public abstract void onPlayerLoginSuccessfully();

    public abstract void onPlayerNameExists();

    public abstract void onNoBulletsToReload();

    public abstract void onMagazineIsFull();

    public abstract void onPickUpWeapon(RoleSprite roleSprite);

    public abstract void onThrowWeapon(RoleSprite roleSprite);

    public abstract void onInjured(RoleSprite roleSprite, int damage);

    public abstract void onSwitchWeapon(RoleSprite roleSprite);

    public abstract void onReload(RoleSprite roleSprite);

    public abstract void onDead(RoleSprite roleSprite);

    public abstract void onMove(RoleSprite roleSprite);

    public abstract void onTurn(RoleSprite roleSprite);


}
