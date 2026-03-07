package org.game.locations.zones.districts;

import org.game.events.Rumor;
import org.game.events.rumors.Poisonning;
import org.game.locations.District;
import org.game.locations.Location;

import java.util.List;

public class Aqueduct extends District {
    public Aqueduct(Location lieux) {
        super(lieux);
        possibleRumors= List.of(new Poisonning());
    }

    @Override
    public Rumor getRumor(Location lieux) {
        return null;
    }
}
