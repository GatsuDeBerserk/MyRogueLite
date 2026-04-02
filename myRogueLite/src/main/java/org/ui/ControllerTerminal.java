package org.ui;

import org.game.caracters.IAlly;
import org.game.caracters.IEnemie;
import org.game.caracters.fighters.Other.Andre;
import org.game.caracters.fighters.Other.Charles;
import org.game.caracters.fighters.Other.Night;
import org.game.caracters.fighters.knights.Jeanne;
import org.game.caracters.fighters.knights.Joseph;
import org.game.caracters.fighters.knights.Lancelot;
import org.game.caracters.fighters.knights.Oscar;
import org.game.caracters.fighters.mages.Adam;
import org.game.caracters.fighters.mages.Eve;
import org.game.caracters.fighters.monsters.RatKing;
import org.game.caracters.fighters.monsters.Werecat;
import org.game.events.DelegateListesRumeurs;
import org.game.locations.Kingdom;

import java.util.ArrayList;
import java.util.List;

public class ControllerTerminal {
    public List<IAlly> listAllyCaracters = new ArrayList<IAlly>();
    public List<IEnemie> listEnemieCaracters = new ArrayList<IEnemie>();
    public Kingdom kingdom = new Kingdom();

    public void start() {
//        Fighter charles = new Charles();
//        System.out.println("Bang ! "+charles.attaque()+" Dégats dans ta face !");
//        System.out.println(DelegateReadLine.question());
//        System.out.println(DelegateReadLine.question("je pose une question"));
        remplireListes();
        while (1 == 1) {
            kingdom.generateNewEncounter();
        }
    }

    public void remplireListes() {
        Andre andre = new Andre();

        listAllyCaracters.add(new Jeanne());
        listAllyCaracters.add(new Oscar());
        listAllyCaracters.add(new Adam());
        listAllyCaracters.add(new Werecat());
        listAllyCaracters.add(new Night());
        listAllyCaracters.add(andre);

        listEnemieCaracters.add(new Joseph());
        listEnemieCaracters.add(new Lancelot());
        listEnemieCaracters.add(new Eve());
        listEnemieCaracters.add(new RatKing());
        listEnemieCaracters.add(new Charles());
        listEnemieCaracters.add(new Andre());
    }
}
