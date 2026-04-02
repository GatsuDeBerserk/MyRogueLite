package org.game.locations;


import org.game.RandomDelegate;
import org.game.events.Rumor;

import java.util.HashMap;
import java.util.Map;

abstract public class Location {
    RandomDelegate rd = new RandomDelegate();
    public Map<String, District> district;
    public String name;

    public Location(Map<String, District> district, String name) {
        this.district = district;
        this.name = name;
    }

    public Rumor newRumor() {
        int nb = rd.from0toX(district.size());
        int i = 0;
        for (District d : district.values()) {
            if (i == nb) {
                return d.getRumor();
            }
            i++;
        }
        return null;
    }
}
