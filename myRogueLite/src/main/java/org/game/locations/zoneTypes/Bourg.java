package org.game.locations.zoneTypes;

import org.game.locations.District;
import org.game.locations.Location;

import java.util.Map;

abstract public class Bourg extends Location {
    public Bourg(Map<String, District> district, String name) {
        super(district, name);
    }
}
