package org.game.caracters.fighters.knights;

import org.game.caracters.IEnemie;
import org.game.caracters.fighters.Knight;
import org.game.items.Weapon;
import org.game.items.weapon.mele.Sword;

public class Joseph extends Knight implements IEnemie {
    public Joseph() {
        super(new Sword());
    }
}
