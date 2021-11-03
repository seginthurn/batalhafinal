package com.inthurn.batalhafinal.combatsystem;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.utils.DiceRoll;

import java.lang.Character;
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
        this.setDifficultyBonus();
    }


    @Override
    public void setDifficultyBonus() {
        if (this.difficulty.equals(difficulty.EASY)) {
            this.hero.setAttackPoints(this.hero.getAttackPoints() + (int) ((this.hero.getAttackPoints() * this.difficulty.getDifficulty()) / 100));
        } else if (this.difficulty.equals(Difficulty.HARD)) {
            this.villain.setAttackPoints(this.villain.getAttackPoints() + (int) ((this.villain.getAttackPoints() * this.difficulty.getDifficulty()) / 100));
        }
    }

    @Override
    public void battle() {
        Scanner scanner = new Scanner(System.in);
        Integer option;
        Integer dice;

        while (hero.getDead() == false && villain.getDead() == false) {
            System.out.println("Insira uma ação");
            System.out.println("1 - Atacar");
            System.out.println("2 - Ver Status");
            System.out.println("3 - Olhar para o inimigo");
            System.out.println("3 - Fugir");
            option = scanner.nextInt();

            switch (option){
                case 2:
                    this.hero.showStatus();
                    continue;
                case 3:
                    this.villain.showStatus();
                    continue;
                case 4:
                    System.out.println("você fugiu!");
                    this.hero.setDead(true);
                    return;
                default:
                    break;
            }
            System.out.println("Rolando os dados... ");
            dice = DiceRoll.roll();
            System.out.println("A rolagem dos dados deu:" + dice);
            attack(hero, dice);

            if (villain.getDead() == true) {
                System.out.println("Morreu!");
                break;
            }

            System.out.println("Agora é o turno do inimigo");
            attack(villain, dice);

        }
        ;


    }

    @Override
    public void attack() {


    }

    //Overdrive
    public void attack(Hero hero, Integer dice) {
        int damage = 0;

        if (dice == 20) {
            damage = (int) this.hero.getAttackPoints() + dice;
        } else if (dice > 1 || dice < 20) {
            System.out.println("\n");
            System.out.println("----------------------------------------------------");
            System.out.println("Dados " + dice);
            System.out.println("Defesa do vilão " + this.villain.getDefensePoints());
            System.out.println("Ataque do herói " + this.hero.getAttackPoints());
            damage = ((this.hero.getAttackPoints() + dice) - this.villain.getDefensePoints());
            System.out.println("Dano: " + damage );
            System.out.println("----------------------------------------------------");

        }
        System.out.println(damage);
        this.villain.setLifePoints(this.villain.getLifePoints() - damage);

        if (this.villain.getLifePoints() <= 0) {
            this.villain.setDead(true);
            System.out.println("Parabéns o vilão morreu!");
        } else {
            System.out.println("O inimigo sofreu " + damage + " de dano e agora tem " + this.villain.getLifePoints() + " pontos de vida");
        }

    }

    public void attack(Villain villain, Integer dice) {
        int damage = 0;

        if (dice == 1) {
            System.out.println("O inimigo errou o ataque! Você não sofreu dano");
        } else if (dice == 20) {
            damage = (int) this.villain.getAttackPoints() + dice;
            System.out.println("O inimigo acertou um ataque crítico! Você sofreu " + damage + " de dano e agora possui " + hero.getLifePoints() + " pontos de vida");
            this.hero.setLifePoints(this.hero.getLifePoints() - damage);
        } else if (dice > 1 || dice < 20) {
            damage = (this.villain.getAttackPoints() + dice) - this.hero.getDefensePoints();
        }

        this.hero.setLifePoints(this.hero.getLifePoints() - damage);

        if (this.hero.getLifePoints() <= 0) {
            System.out.println(this.hero.getPath().getDiesMessage() + this.hero.getGender().getDiesMessage());
        } else {
            System.out.println("O inimigo atacou! Você sofreu " + damage + " de dano e agora possui " + hero.getLifePoints() +
                    " pontos de vida.");
        }

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
