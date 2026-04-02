package org.game.locations;


import org.game.events.Rumor;

import java.util.HashMap;
import java.util.Map;

abstract public class Location {
    public Map<String, District> district;
    public String name;

    public Location(Map<String, District> district,String name) {
        this.district = district;
        this.name = name;
    }

    abstract public Rumor newRumor();
}
