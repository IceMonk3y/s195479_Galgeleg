package com.example.galgeleg_s195479.data;

public class Highscore {
    private int score;
    private String name;

    public Highscore( int score, String name) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Highscore:" +
                "username='" + name + '\'' +
                ", score=" + score;
    }


}
