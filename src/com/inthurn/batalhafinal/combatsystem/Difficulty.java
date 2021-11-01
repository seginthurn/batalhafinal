package com.inthurn.batalhafinal.combatsystem;

public enum Difficulty {
    EASY(20.0f), MEDIUM(0.0f), HARD(10.0f);

    private Float difficulty;

    Difficulty(Float difficulty) {
        this.difficulty = difficulty;
    }

    public Float getDifficulty() {
        return difficulty;
    }
}
