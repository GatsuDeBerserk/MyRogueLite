package org.game.locations.zones.districts;

import org.game.events.Rumor;
import org.game.locations.District;
import org.game.locations.Location;

public class Cemetry extends District {

    public Cemetry(Location lieux) {
        super(lieux);
    }

    @Override
    public Rumor getRumor(Location lieux) {
        return null;
    }
}
