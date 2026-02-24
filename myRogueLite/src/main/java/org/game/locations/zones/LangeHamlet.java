package org.game.locations.zones;

import org.game.locations.District;
import org.game.locations.zoneTypes.Hamlet;
import org.game.locations.zones.districts.Market;

import java.util.HashMap;
import java.util.Map;

public class LangeHamlet extends Hamlet {
    public LangeHamlet() {
        super(new HashMap<String, District>(), "Lange Hamlet");
        district.put("Cemetry", new Market(this));
        district.put("Habitations", new Market(this));
        district.put("Well", new Market(this));
        district.put("Cemetry", new Market(this));
        district.put("Cemetry", new Market(this));
    }
}
