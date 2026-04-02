package org.game.locations.zones;

import org.game.events.Rumor;
import org.game.locations.District;
import org.game.locations.Location;
import org.game.locations.zones.districts.*;

import java.util.HashMap;
import java.util.Map;

public class HolyCapital extends Location {
    public HolyCapital() {
        super(new HashMap<String, District>(), "Holy Capital of Marfan");
        district.put("Aqueduct", new Aqueduct(this));
        district.put("Cathedral", new Cathedral(this));
        district.put("Cemetry", new Cemetry(this));
        district.put("Church1", new Church(this));
        district.put("Church2", new Church(this));
        district.put("Church3", new Church(this));
        district.put("Fountain", new Fountain(this));
    }

}
