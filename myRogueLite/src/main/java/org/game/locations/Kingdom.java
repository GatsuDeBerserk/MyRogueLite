package org.game.locations;

import org.game.events.DelegateListesRumeurs;
import org.game.locations.zones.HolyCapital;
import org.game.locations.zones.KehrBourg;
import org.game.locations.zones.LangeHamlet;
import org.ui.ControllerTerminal;

import java.util.HashMap;
import java.util.Map;

import static org.ui.ControllerTerminal.listAllyCaracters;

public class Kingdom {
    private Map<String, Location> kingdom = new HashMap<>();
    DelegateListesRumeurs rumeurs;

    public Kingdom(DelegateListesRumeurs rumeurs) {
        this.rumeurs=rumeurs;
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

    public void generateNewEncounter(){
    }
}
