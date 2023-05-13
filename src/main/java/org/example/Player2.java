package org.example;

public class Player2 {
    String name;
    int points;

    public Player2() {
    }

    public int addpoints(int roll1x) {
        points = points + roll1x;
        return points;
    }
}
