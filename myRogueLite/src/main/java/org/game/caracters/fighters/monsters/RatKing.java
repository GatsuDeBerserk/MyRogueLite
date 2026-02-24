package org.game.caracters.fighters.monsters;

import org.game.caracters.IEnemie;
import org.game.caracters.fighters.Monster;
import org.game.items.Weapon;
import org.game.items.weapon.ranged.Needle;

public class RatKing extends Monster implements IEnemie {
    public RatKing() {
        super(new Needle());
    }
}
