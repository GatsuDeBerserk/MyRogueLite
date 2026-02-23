package org.game.caracters;

import org.game.items.Weapon;

public class Fighter extends GameCharacter {
    public Weapon arme;

    public Fighter(Weapon arme) {
        super();
        this.arme=arme;
    }

    public int attaque(){
        return arme.damage;
    }
}
