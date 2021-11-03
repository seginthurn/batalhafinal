package com.inthurn.batalhafinal.character;

public abstract class Character {
    private String name;
    private Integer lifePoints;
    private Integer attackPoints;
    private Integer defensePoints;
    private Boolean isDead;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(Integer lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Integer getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(Integer defensePoints) {
        this.defensePoints = defensePoints;
    }

    public Integer getAttackPoints() {
        return attackPoints;
    }

    public Boolean getDead() {

        return isDead;
    }

    public void setDead(Boolean dead) {
        isDead = dead;
    }

    public void setAttackPoints(Integer attackPoints) {
        this.attackPoints = attackPoints;
    }
}
