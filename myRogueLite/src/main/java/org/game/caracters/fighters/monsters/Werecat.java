package org.game.caracters.fighters.monsters;

import org.game.caracters.IAlly;
import org.game.caracters.fighters.Monster;
import org.game.items.Weapon;

public class Werecat extends Monster implements IAlly {
    public Werecat(Weapon arme) {
        super(arme);
    }
}
