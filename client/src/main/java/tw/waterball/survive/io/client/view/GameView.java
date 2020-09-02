package tw.waterball.survive.io.client.view;


import tw.waterball.survive.io.client.controller.PlayerController;
import tw.waterball.survive.io.client.sprite.role.Role;
import tw.waterball.survive.io.client.sprite.Sprite;


public abstract class GameView {
    private State state;
    private PlayerController playerController;

    public void launch() {

    }

    public void onRender(Sprite[] sprites) {

    }

    public void onAttack(String soundPath, Role role) {

    }

    public void onPlayerLoginSuccess() {

    }

    public void onPlayerSameName() {

    }

    public void onNoBulletToLoad() {

    }

    public void onMagazineIsFull() {

    }

    public void onPickUpWeapon(Role role) {

    }

    public void onThrowWeapon(Role role) {

    }

    public void onSufferInjury(Role role,int damage) {

    }

    public void onSwitchWeapon(Role role) {

    }

    public void onReload(Role role) {

    }

    public void onDead(Role role) {

    }

    public void onMove(Role role) {

    }

    public void onTurn(Role role) {

    }


}
