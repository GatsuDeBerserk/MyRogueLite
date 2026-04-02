package org.game.locations.zones;

import org.game.events.Rumor;
import org.game.locations.District;
import org.game.locations.zoneTypes.Bourg;
import org.game.locations.zones.districts.*;

import java.util.HashMap;

public class KehrBourg extends Bourg {
    public KehrBourg() {
        super(new HashMap<String, District>(),"Kehr Bourg");
//        district.put("Cemetry", new Cemetry(this));
//        district.put("Market", new Market(this));
//        district.put("Monastary", new Monastary(this));
//        district.put("Wall", new Wall(this));
//        district.put("Habitation", new Habitations(this));
//        district.put("TownHall", new TownHall(this));
        district.put("Fields", new Fields(this));
        district.put("Mines", new Mines(this));
        district.put("Forest", new Forest(this));
    }

}
