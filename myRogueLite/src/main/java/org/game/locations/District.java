package org.game.locations;

import org.game.events.Rumor;

import java.util.List;

abstract public class District {
    public Location lieux;
    public List<Rumor> possibleRumors;

    public District(Location lieux) {
        this.lieux = lieux;
    }

    public abstract Rumor getRumor(Location lieux);

}
