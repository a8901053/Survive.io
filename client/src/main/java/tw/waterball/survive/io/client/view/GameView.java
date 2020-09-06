package tw.waterball.survive.io.client.view;


import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.client.sprite.Sprite;
import tw.waterball.survive.io.client.sprite.role.RoleSprite;
import tw.waterball.survive.io.client.sprite.weapon.WeaponSprite;


public abstract class GameView {
    private State state;
    private PlayerController playerController;

    public void launch() {

    }

    public void onRender(Sprite... sprites) {

    }

    public void onWeaponUsed(WeaponSprite weaponSprite) {

    }

    public void onPlayerLoginSuccessfully() {

    }

    public void onPlayerNameExists() {

    }

    public void onNoBulletToReload() {

    }

    public void onMagazineIsFull() {

    }

    public void onPickUpWeapon(RoleSprite roleSprite) {

    }

    public void onThrowWeapon(RoleSprite roleSprite) {

    }

    public void onInjury(RoleSprite roleSprite, int damage) {

    }

    public void onSwitchWeapon(RoleSprite roleSprite) {

    }

    public void onReload(RoleSprite roleSprite) {

    }

    public void onDead(RoleSprite roleSprite) {

    }

    public void onMove(RoleSprite roleSprite) {

    }

    public void onTurn(RoleSprite roleSprite) {

    }


}
