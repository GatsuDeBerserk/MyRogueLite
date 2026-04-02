package org.game.locations;

import org.game.RandomDelegate;
import org.game.events.Rumor;

import java.util.List;

abstract public class District {
    RandomDelegate rd=new RandomDelegate();
    public Location lieux;
    public List<Rumor> possibleRumors;

    public District(Location lieux) {
        this.lieux = lieux;
    }

    public Rumor getRumor(){
        int nb=rd.from0toX(possibleRumors.size());
        int i=0;
        for (Rumor r :possibleRumors){
            if (i==nb){
                return r;
            }
            i++;
        }
       return null;
    }

}
