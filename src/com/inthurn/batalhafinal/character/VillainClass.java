package com.inthurn.batalhafinal.character;

public enum VillainClass {
    WAR_ORC("Orc Armeiro", 150, 15, 8),
    CIENTIST_ORC("Orc ciêntista", 150, 15, 5),
    BOSS("O Líder", 200, 20, 10);

    private final String villainName;
    private final Integer lifePoints;
    private final Integer attackPoints;
    private final Integer deffensePoints;

    VillainClass(String villainName, Integer lifePoints, Integer attackPoints, Integer deffensePoints) {
        this.villainName = villainName;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.deffensePoints = deffensePoints;
    }

    public String getVillainName() {
        return villainName;
    }


    public Integer getLifePoints() {
        return lifePoints;
    }

    public Integer getAttackPoints() {
        return attackPoints;
    }


    public Integer getDeffensePoints() {
        return deffensePoints;
    }


}
