package com.inthurn.batalhafinal.combatsystem;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.utils.DiceRoll;

import java.util.Random;
import java.util.Scanner;

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
    public void setDifficultyBonus() {
        if (this.difficulty.equals(difficulty.EASY)) {
            hero.setAttackPoints(hero.getAttackPoints() + (int) ((hero.getAttackPoints() * this.difficulty.getDifficulty()) / 100));
        } else if (this.difficulty.equals(Difficulty.HARD)) {
            villain.setAttackPoints(villain.getAttackPoints() + (int) ((villain.getAttackPoints() * this.difficulty.getDifficulty()) / 100));
        }
    }

    @Override
    public void battle() {
        Scanner scanner = new Scanner(System.in);
        Integer option;
        Integer dice;
        while(hero.getDead() == false){
            System.out.println("Insira uma ação");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            option = scanner.nextInt();
            if(option == 1){
                dice = DiceRoll.roll();
                if(dice == 1){
                    System.out.println("Você errou!");
                }

            }

        };


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
