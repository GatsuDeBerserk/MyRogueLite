package org.game.locations.zones;

import org.game.locations.District;
import org.game.locations.Location;
import org.game.locations.zones.districts.*;

import java.util.HashMap;
import java.util.Map;

public class HolyCapital extends Location {
    public HolyCapital() {
        super(new HashMap<String, District>(),"Holy Capital of Marfan");
        district.put("Cemetry", new Cemetry(this));
        district.put("Market", new Market(this));
        district.put("Monastary", new Monastary(this));
        district.put("Wall", new Wall(this));
        district.put("Habitation", new Habitations(this));
        district.put("TownHall", new TownHall(this));
    }
}
