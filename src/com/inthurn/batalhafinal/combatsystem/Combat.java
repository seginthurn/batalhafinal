package com.inthurn.batalhafinal.combatsystem;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.itens.ItemTypes;
import com.inthurn.batalhafinal.utils.DiceRoll;
import com.inthurn.batalhafinal.utils.GameLogo;
import com.inthurn.batalhafinal.utils.Keyboard;


public class Combat implements CombatActions {
    private Difficulty difficulty;
    private Hero hero;
    private Villain villain;

    public Combat(Hero hero, Villain villain, Difficulty difficulty) {
        this.setDifficulty(difficulty);
        this.setHero(hero);
        this.setVillain(villain);
        this.setDifficultyBonus();
    }

    @Override
    public void useItem() {
        Integer option;
        System.out.println("Você verifcou sua mochila..");
        System.out.println("\n");
        hero.listItem();
        System.out.println("---------------------------");

        System.out.println("Selecione o item para usar: ");
        System.out.println("1 - " + ItemTypes.LIFEPOTION.getDescription());
        System.out.println("2 - " + ItemTypes.ATTACKPOTION.getDescription());
        System.out.println("3 - " + ItemTypes.DEFENSEPOTION.getDescription());
        System.out.println("\n");
        System.out.println("4 - Voltar");

        option = Keyboard.scanInteger();
        switch (option) {
            case 1 -> hero.useItem(ItemTypes.LIFEPOTION);
            case 2 -> hero.useItem(ItemTypes.ATTACKPOTION);
            case 3 -> hero.useItem(ItemTypes.DEFENSEPOTION);
            case 4 -> this.battle();
            default -> {
                System.out.println("Item inválido");
                this.useItem();
            }
        }


    }

    @Override
    public void setDifficultyBonus() {
        if (this.getDifficulty().equals(Difficulty.EASY)) {
            this.getHero().setAttackPoints(this.getHero().getAttackPoints() + (int) ((this.getHero().getAttackPoints() * this.getDifficulty().getDifficulty()) / 100));
        } else if (this.getDifficulty().equals(Difficulty.HARD)) {
            this.getVillain().setAttackPoints(this.getVillain().getAttackPoints() + (int) ((this.getVillain().getAttackPoints() * this.getDifficulty().getDifficulty()) / 100));
        }
    }

    @Override
    public void battle() {
        Integer option;
        Integer dice;

        while (!hero.getDead() && !villain.getDead()) {
            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
            System.out.println("---------------------------");
            System.out.println("Insira uma ação");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar items");
            System.out.println("3 - Ver Status");
            System.out.println("4 - Olhar para o inimigo");
            System.out.println("5 - Fugir");
            option = Keyboard.scanInteger();
            dice = DiceRoll.roll();
            System.out.println("---------------------------");

            switch (option) {
                case 1 -> {
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                    System.out.println("---------------------------");
                    System.out.println("Rolando os dados... ");
                    System.out.println("A rolagem dos dados deu: " + dice);
                    attack(dice);
                    System.out.println("---------------------------");
                }
                case 2 -> {
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                    System.out.println("---------------------------");
                    this.useItem();
                }
                case 3 -> {
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                    this.getHero().showStatus();
                    Keyboard.pressEnterToContinue();
                    continue;
                }
                case 4 -> {
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                    this.getVillain().showStatus();
                    Keyboard.pressEnterToContinue();
                    continue;
                }
                case 5 -> {
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                    System.out.println("---------------------------");
                    System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
                    GameLogo.gameOver();
                    System.out.println("---------------------------");
                    System.exit(0);
                }
                default -> {
                }
            }

            if (villain.getDead()) {
                break;
            }
            System.out.println("Agora é o turno do inimigo");
            System.out.println("\n");
            villainAttack(dice);
        }
    }

    public void attack(Integer dice) {
        int damage;

        if (dice == 20) {
            damage = (int) this.getHero().getAttackPoints() + dice;
            System.out.println("--------------------------");
            System.out.println("Você acertou um ataque crítico!");
        } else {
            damage = ((this.getHero().getAttackPoints() + dice) - this.getVillain().getDefensePoints());

        }
        this.getVillain().setLifePoints(this.getVillain().getLifePoints() - damage);
        if (this.getVillain().getLifePoints() <= 0) {
            this.getVillain().setDead(true);
            System.out.println("--------------------------");
            System.out.println("“O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
        } else {
            System.out.println("--------------------------");
            System.out.println("Você o atacou com " + this.getHero().getWeaponType().getAttackMessage() + "causando " + damage + " de dano!");
        }
        Keyboard.pressEnterToContinue();

    }

    public void villainAttack(Integer dice) {
        int damage;

        if (dice == 1) {

            System.out.println("--------------------------");
            System.out.println("O inimigo errou o ataque! Você não sofreu dano");
            Keyboard.pressEnterToContinue();
            return;
        } else if (dice == 20) {
            damage = (int) this.getVillain().getAttackPoints() + dice;
            System.out.println("--------------------------");
            System.out.println("O inimigo acertou um ataque crítico! Você sofreu " + damage + " de dano e agora possui " + hero.getLifePoints() + " pontos de vida");
            this.getHero().setLifePoints(this.getHero().getLifePoints() - damage);
            Keyboard.pressEnterToContinue();
        } else {
            damage = (this.getVillain().getAttackPoints() + dice) - this.getHero().getDefensePoints();
            if (damage < 0) {
                System.out.println("--------------------------");
                System.out.println("O inimigo acertou o ataque, mas sua defesa foi perfeita e ele não conseguiu te atingir");
                return;
            }
        }

        this.getHero().setLifePoints(this.getHero().getLifePoints() - damage);

        if (this.getHero().getLifePoints() <= 0) {
            System.out.println("O inimigo atacou...");
            showDiesMessage();
            GameLogo.gameOver();
            System.exit(0);
        } else {
            System.out.println("--------------------------");
            System.out.println("O inimigo atacou! Você sofreu " + damage + " de dano e agora possui " + hero.getLifePoints() +
                    " pontos de vida.");
            Keyboard.pressEnterToContinue();
        }

    }

    public void showDiesMessage() {
        switch (this.getHero().getPath()) {
            case VENGEANCE -> System.out.println("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");
            case GLORY -> System.out.println("A glória que buscavas não será sua e a cidade aguarda por " + this.getHero().getSex().getDiesMessage());
        }
    }

    public static void scenarioAttack(Hero hero) {
        Integer damage = WeaponType.BOW_ARROW.getAttackBonus() + DiceRoll.roll(10);
        System.out.println("--------------------------");
        System.out.println("Você tomou " + damage + " de dano!");
        hero.setLifePoints(hero.getLifePoints() - damage);
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
