package org.example;

public class Player1 {
    String name;
    int points;

    public Player1() {
    }

    public int addpoints(int roll1x) {
        points = points + roll1x;
        return points;
    }
}
