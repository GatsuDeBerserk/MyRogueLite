package org.game.locations.zones;

import org.game.locations.District;
import org.game.locations.zoneTypes.Hamlet;
import org.game.locations.zones.districts.*;

import java.util.HashMap;
import java.util.Map;

public class LangeHamlet extends Hamlet {
    public LangeHamlet() {
        super(new HashMap<String, District>(), "Lange Hamlet");
        district.put("Cemetry", new Cemetry(this));
//        district.put("Habitations", new Habitations(this));
        district.put("Well", new Well(this));
        district.put("Chapel", new Chapel(this));
//        district.put("ChiefsHouse", new ChiefsHouse(this));
//        district.put("Forest", new Forest(this));
//        district.put("Fields", new Fields(this));
    }
}
