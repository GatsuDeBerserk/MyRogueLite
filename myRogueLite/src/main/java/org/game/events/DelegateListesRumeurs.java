package org.game.events;

import org.game.events.rumors.VampireRumor;

import java.util.ArrayList;
import java.util.List;

public class DelegateListesRumeurs {
    public List<Rumor> allRumors = new ArrayList<>();
    public List<VampireRumor> vampireRumors = new ArrayList<>();

    public DelegateListesRumeurs() {
    }


    // 1 méthode pour chaque type de rumeurs qui retourne 1 rumeur random
}
