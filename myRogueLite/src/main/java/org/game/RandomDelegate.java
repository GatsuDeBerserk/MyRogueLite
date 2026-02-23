package org.game;

public class RandomDelegate {
    public int randInt1toX(int x) {
        return 1 + (int) (Math.random() * x);
    }
}
