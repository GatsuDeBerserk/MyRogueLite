package org.game.caracters.fighters.Other;

import org.game.caracters.Fighter;
import org.game.caracters.IAlly;
import org.game.items.weapon.mele.Dagger;

public class Night extends Fighter implements IAlly {
    public Night() {
        super(new Dagger());
    }
}
