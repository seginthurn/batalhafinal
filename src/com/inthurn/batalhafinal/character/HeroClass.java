package com.inthurn.batalhafinal.character;

public enum HeroClass {
    ARCHER("Arqueiro", 50, 22, 12),
    HUNTER("Caçador", 65, 20, 10),
    WARRIOR("Guerreiro", 75, 18, 20),
    PALADIN("Paladin", 60, 20, 21),
    MAGE("Mago", 40, 25, 10),
    WARLOCK("Bruxo", 45, 28, 10);

    private String type;
    private Integer lifePoints;
    private Integer attack;
    private Integer defense;

    HeroClass(String type, Integer lifePoints, Integer attack, Integer defense) {
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

    @Override
    public String toString() {
        return "HeroClass{" +
                "type='" + type + '\'' +
                ", lifePoints=" + lifePoints +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
