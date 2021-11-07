package com.inthurn.batalhafinal.character;


public enum CharClass {
    ARCHER("Arqueiro", 150, 22, 12),
    HUNTER("Caçador", 165, 20, 10),
    WARRIOR("Guerreiro", 175, 18, 20),
    PALADIN("Paladino", 160, 20, 21),
    MAGE("Mago", 140, 25, 10),
    WARLOCK("Bruxo", 145, 28, 10);

    private final String type;
    private final Integer lifePoints;
    private final Integer attack;
    private final Integer defense;

    CharClass(String type, Integer lifePoints, Integer attack, Integer defense) {
        this.type = type;
        this.lifePoints = lifePoints;
        this.attack = attack;
        this.defense = defense;
    }

    public String getType() {
        return type;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }


}
