package org.game.locations.zones.districtType;

import org.game.events.Rumor;
import org.game.locations.District;
import org.game.locations.Location;

public class ReligiousDistrict extends District {
    public ReligiousDistrict(Location lieux) {
        super(lieux);
    }

    public Rumor getRumor(Location lieux) {
        return null;
    }
}
