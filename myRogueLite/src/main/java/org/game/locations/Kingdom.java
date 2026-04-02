package org.game.locations;

import org.game.RandomDelegate;
import org.game.events.DelegateListesRumeurs;
import org.game.events.Rumor;
import org.game.locations.zones.HolyCapital;
import org.game.locations.zones.KehrBourg;
import org.game.locations.zones.LangeHamlet;
import org.ui.ControllerTerminal;

import java.util.HashMap;
import java.util.Map;


public class Kingdom {
    private Map<String, Location> kingdom = new HashMap<>();
    private Rumor currentRumor;
    private RandomDelegate rd = new RandomDelegate();

    public Kingdom() {
        addLoc(new KehrBourg());
        addLoc(new LangeHamlet());
        addLoc(new HolyCapital());
    }

    public Map<String, Location> getKingdom() {
        return kingdom;
    }

    public void addLoc(Location location) {
        this.kingdom.put(location.name, location);
    }

    public Rumor generateNewEncounter() {
        int locationNumber = rd.from0toX(kingdom.size());
        if (locationNumber == 0) throw new ArithmeticException("no loctions in the kingdom");
        int i = 0;
        for (Location loc : kingdom.values()) {
            if (locationNumber == i) {
                return loc.newRumor();
            }
            i++;
        }
        return null;
    }
}
