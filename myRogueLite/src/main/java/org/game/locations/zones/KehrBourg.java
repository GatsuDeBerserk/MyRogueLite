package org.game.locations.zones;

import org.game.locations.District;
import org.game.locations.zoneTypes.Bourg;
import org.game.locations.zones.kehr.*;

import java.util.HashMap;
import java.util.Map;

public class KehrBourg extends Bourg {
    public KehrBourg() {
        quartiers.put("Cemetry", new KehrMarket(this));
        quartiers.put("Market", new KehrMarket(this));
        quartiers.put("Monastary", new KehrMonastary(this));
        quartiers.put("Wall", new KehrWall(this));
        quartiers.put("Habitation", new KehrHabitations(this));
        quartiers.put("TownHall", new KehrTownHall(this));
    }
}
