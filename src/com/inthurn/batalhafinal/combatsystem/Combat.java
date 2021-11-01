package com.inthurn.batalhafinal.combatsystem;

import com.inthurn.batalhafinal.character.*;

import java.util.Random;

public class Combat implements CombatActions {
    private Difficulty difficulty;
    private Hero hero;
    private Villain villain;

    public Combat(Hero hero, Villain villain, Difficulty difficulty) {
        this.difficulty = difficulty;
        this.hero = hero;
        this.villain = villain;
    }

    @Override
    public Integer rollDice() {
        Random random = new Random();
        Integer dice = random.nextInt(20);
        return dice;
    }

    @Override
    public void setDifficultyBonus() {
        if (this.difficulty.equals(difficulty.EASY)) {
            hero.setAttackPoints(hero.getAttackPoints() + (int) ((hero.getAttackPoints() * this.difficulty.getDifficulty()) / 100));
        } else if (this.difficulty.equals(Difficulty.HARD)) {
            villain.setAttackPoints(villain.getAttackPoints() + (int) ((villain.getAttackPoints() * this.difficulty.getDifficulty()) / 100));
        }
    }

    @Override
    public void battle(Hero hero, Villain villain) {


    }



    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Villain getVillain() {
        return villain;
    }

    public void setVillain(Villain villain) {
        this.villain = villain;
    }


}
