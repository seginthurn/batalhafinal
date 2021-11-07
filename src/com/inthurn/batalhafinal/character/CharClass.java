package com.inthurn.batalhafinal.character;
import java.nio.file.Watchable;
import java.util.stream.*;

public enum CharClass {
    ARCHER("Arqueiro", 150, 22, 12),
    HUNTER("Caçador", 165, 20, 10),
    WARRIOR("Guerreiro", 175, 18, 20),
    PALADIN("Paladino", 160, 20, 21),
    MAGE("Mago", 140, 25, 10),
    WARLOCK("Bruxo", 145, 28, 10);

    private String type;
    private Integer lifePoints;
    private Integer attack;
    private Integer defense;

    CharClass(String type, Integer lifePoints, Integer attack, Integer defense) {
        this.type = type;
        this.lifePoints = lifePoints;
        this.attack = attack;
        this.defense = defense;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(Integer lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

}
