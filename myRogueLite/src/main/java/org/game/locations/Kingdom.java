package org.game.locations;

import org.game.locations.zones.HolyCapital;
import org.game.locations.zones.KehrBourg;
import org.game.locations.zones.LangeHamlet;
import org.ui.ControllerTerminal;

import java.util.HashMap;
import java.util.Map;

public class Kingdom {
    private Map<String, Location> kingdom = new HashMap<>();

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
}
