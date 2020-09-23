/*
 *  Copyright 2020 Johnny850807 (Waterball) 潘冠辰
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package tw.waterball.survive.io.game.sprite.role;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import tw.waterball.survive.io.api.api.ClientApi;
import tw.waterball.survive.io.game.sprite.weapon.Gun;
import tw.waterball.survive.io.game.sprite.weapon.Weapon;

/**
 * @author - a89010531111@gmail.com
 */
public class RoleTest {
    private final ClientApi clientApi = Mockito.mock(ClientApi.class);
    private final Role role = new Player(10, 20, clientApi);


    @Test
    public void whenTurnAngleTo50Degrees_thenAngleShouldBe50() {
        role.turnAngleTo(50);
        Assert.assertEquals(50.0, role.getAngle(), 0.1);
    }

    @Test
    public void givenY30AndSpeed30_whenMoveUp_thenYShouldBe0() {
        role.setY(30);
        role.setSpeed(30);

        role.moveUp();

        Assert.assertEquals(0, role.getY());
    }

    @Test
    public void givenY30_whenMoveDown_thenYShouldBe60() {
        role.setY(30);
        role.setSpeed(30);

        role.moveDown();

        Assert.assertEquals(60, role.getY());
    }

    @Test
    public void givenX30_whenMoveLeft_thenXShouldBe0() {
        role.setX(30);
        role.setSpeed(30);

        role.moveLeft();

        Assert.assertEquals(0, role.getX());
    }

    @Test
    public void givenX30_whenMoveRight_thenXShouldBe60() {
        role.setX(30);
        role.setSpeed(30);

        role.moveRight();

        Assert.assertEquals(60, role.getX());
    }

    @Test
    public void givenHp60_whenBeInjuredBy30Damage_thenHpShouldDecreaseTo30() {
        Role enemy = new Player(10, 20, clientApi);
        role.setHp(60);

        role.injure(enemy, 30);

        Assert.assertEquals(30, role.getHp());
    }

    @Test
    public void whenHpIs0_thenShouldBeDead() {
        role.setHp(0);

        Assert.assertTrue(role.isDead());
    }

    @Test
    public void whenHpIs100_thenShouldNotBeDead() {
        role.setHp(100);

        Assert.assertFalse(role.isDead());
    }

    @Test
    public void givenTwoWeapons_whenSwitchToFirstWeapon_thenCurrentWeaponShouldBeAtWeaponSlotIndex1() {
        role.putWeaponToSlot(new Gun(10, 20), 0);
        role.putWeaponToSlot(new Gun(10, 20), 1);

        role.switchCurrentWeapon(1);

        Assert.assertEquals(role.getWeaponBySlotIndex(1), role.getCurrentWeapon());
    }

    @Test
    public void givenWeaponA_whenUseWeapon_thenAShouldBeUsed() {
        Weapon A = Mockito.mock(Weapon.class);
        role.putWeaponToSlot(A, 0);
        role.switchCurrentWeapon(0);

        role.useWeapon();

        Mockito.verify(A).useWeapon();
    }
}