package org.game;

public class RandomDelegate {
    public int from1toX(int x) {
        return 1 + (int) (Math.random() * x);
    }
    public int from0toX(int x) {
        return 1 + (int) (Math.random() * x);
    }
}
