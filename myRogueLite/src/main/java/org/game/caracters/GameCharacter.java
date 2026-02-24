package org.game.caracters;

import org.game.RandomDelegate;
import org.game.items.InGameObject;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter {

    public RandomDelegate rando = new RandomDelegate();
    public List<InGameObject> inventaire = new ArrayList<>();

    public void addItemToInventory(InGameObject item) {
        inventaire.add(item);
    }

    public void removeItemToInventory(InGameObject item) {
        inventaire.remove(item);
    }
}
