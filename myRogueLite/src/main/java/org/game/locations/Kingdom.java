package org.game.locations;

import org.game.locations.zones.KehrBourg;
import org.game.locations.zones.LangeHamlet;

import java.util.HashMap;
import java.util.Map;

public class Kingdom {
    private Map<String,Location> kingdom=new HashMap<>();

    public Kingdom() {
        this.kingdom.put("KherCity",new KehrBourg());
        this.kingdom.put("LangeBourg",new LangeHamlet());
    }
}
