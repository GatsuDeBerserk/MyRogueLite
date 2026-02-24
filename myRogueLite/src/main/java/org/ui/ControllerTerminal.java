package org.ui;

import org.game.caracters.GameCharacter;
import org.game.caracters.IAlly;
import org.game.caracters.IEnemie;
import org.game.caracters.fighters.Animaux.Loup;
import org.game.caracters.fighters.Animaux.Ours;
import org.game.caracters.fighters.knights.Jeanne;
import org.game.caracters.fighters.knights.Joseph;
import org.game.caracters.fighters.knights.Lancelot;
import org.game.caracters.fighters.knights.Oscar;
import org.game.caracters.fighters.mages.Adam;
import org.game.caracters.fighters.mages.Eve;
import org.game.caracters.fighters.monsters.RatKing;
import org.game.caracters.fighters.monsters.Werecat;
import org.game.locations.Kingdom;

import java.util.ArrayList;
import java.util.List;

public class ControllerTerminal {
    public static List<IAlly> listAllyCaracters = new ArrayList<IAlly>();
    public static List<IEnemie> listEnemieCaracters = new ArrayList<IEnemie>();

    public static void start() {
//        Fighter charles = new Charles();
//        System.out.println("Bang ! "+charles.attaque()+" Dégats dans ta face !");
//        System.out.println(DelegateReadLine.question());
//        System.out.println(DelegateReadLine.question("je pose une question"));
        remplireListeCaracters();

        Kingdom royaume = new Kingdom();
        royaume.getKingdom();
    }

    public static void remplireListeCaracters() {
        listAllyCaracters.add(new Jeanne());
        listAllyCaracters.add(new Oscar());
        listAllyCaracters.add(new Adam());
        listAllyCaracters.add(new Werecat());

        listEnemieCaracters.add(new Joseph());
        listEnemieCaracters.add(new Lancelot());
        listEnemieCaracters.add(new Eve());
        listEnemieCaracters.add(new RatKing());
    }
}
