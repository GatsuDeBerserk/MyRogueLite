package org.game.caracters.fighters.mages;

import org.game.MagicElement;
import org.game.caracters.IAlly;
import org.game.caracters.fighters.Mage;
import org.game.items.Weapon;
import org.game.items.weapon.magic.Wand;

public class Adam extends Mage implements IAlly {
    public Adam() {
        super(new Wand(MagicElement.FIRE));
    }
}
