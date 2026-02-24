package org.game.items.weapon;

import org.game.MagicElement;
import org.game.items.Weapon;

public class MagicWeapon extends Weapon {
    MagicElement magicType;
    public MagicWeapon(int damage,MagicElement type) {
        super(damage);
        this.magicType = type;
    }
}
