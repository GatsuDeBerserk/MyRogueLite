package org.game.caracters.fighters.Other;

import org.game.caracters.Fighter;
import org.game.caracters.IEnemie;
import org.game.items.weapon.mele.Axe;

public class Charles extends Fighter implements IEnemie {
    public Charles() {
        super(new Axe());
        addItemToInventory(arme);
    }

}
