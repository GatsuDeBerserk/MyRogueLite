package org.game.locations.zoneTypes;

import org.game.locations.District;
import org.game.locations.Location;

import java.util.Map;

public class Hamlet extends Location {
    public Hamlet(Map<String, District> district, String name) {
        super(district, name);
    }
}
