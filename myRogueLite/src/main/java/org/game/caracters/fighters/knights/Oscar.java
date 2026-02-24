package org.game.caracters.fighters.knights;

import org.game.caracters.IAlly;
import org.game.caracters.fighters.Knight;
import org.game.items.Weapon;
import org.game.items.weapon.ranged.Bow;

public class Oscar extends Knight implements IAlly {
    public Oscar() {
        super(new Bow());
    }
}
