package org.game.caracters.fighters.mages;

import org.game.MagicElement;
import org.game.caracters.IEnemie;
import org.game.caracters.fighters.Mage;
import org.game.items.Weapon;
import org.game.items.weapon.magic.Scepter;

public class Eve extends Mage implements IEnemie {
    public Eve() {
        super(new Scepter(MagicElement.ICE));
    }
}
