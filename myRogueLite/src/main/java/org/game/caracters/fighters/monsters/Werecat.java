package org.game.caracters.fighters.monsters;

import org.game.caracters.IAlly;
import org.game.caracters.fighters.Monster;
import org.game.items.Weapon;
import org.game.items.weapon.mele.Claw;

public class Werecat extends Monster implements IAlly {
    public Werecat() {
        super(new Claw());
    }
}
