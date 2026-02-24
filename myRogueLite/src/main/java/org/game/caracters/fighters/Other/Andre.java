package org.game.caracters.fighters.Other;

import org.game.caracters.Fighter;
import org.game.caracters.IAlly;
import org.game.caracters.IEnemie;
import org.game.items.weapon.mele.WarHammer;

public class Andre extends Fighter implements IAlly, IEnemie {
    public Andre() {
        super(new WarHammer());
    }
}
