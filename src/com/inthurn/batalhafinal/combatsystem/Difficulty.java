package com.inthurn.batalhafinal.combatsystem;

public enum Difficulty {
    EASY("Fácil", 20.0f), MEDIUM("Normal", 0.0f), HARD("Difícil", 10.0f);

    private String description;

    Difficulty(String description, Float difficulty) {
        this.description = description;
        this.difficulty = difficulty;
    }

    private Float difficulty;

    Difficulty(Float difficulty) {
        this.difficulty = difficulty;
    }

    public Float getDifficulty() {
        return difficulty;
    }
    public String getDescription() {
        return description;
    }

}
