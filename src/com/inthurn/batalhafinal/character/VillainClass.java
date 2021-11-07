package com.inthurn.batalhafinal.character;

public enum VillainClass {
    WAR_ORC("Orc Armeiro", 150, 15, 8),
    CIENTIST_ORC("Orc ciêntista", 150, 15, 5),
    BOSS("O Líder", 200, 20, 10);

    private String villainName;
    private Integer lifePoints;
    private Integer attackPoints;
    private Integer deffensePoints;

    VillainClass(String villainName, Integer lifePoints, Integer attackPoints, Integer deffensePoints) {
        this.villainName = villainName;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.deffensePoints = deffensePoints;
    }

    public String getVillainName() {
        return villainName;
    }

    public void setvillainName(String villainName) {
        this.villainName = villainName;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(Integer lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Integer getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(Integer attackPoints) {
        this.attackPoints = attackPoints;
    }

    public Integer getDeffensePoints() {
        return deffensePoints;
    }

    public void setDeffensePoints(Integer deffensePoints) {
        this.deffensePoints = deffensePoints;
    }

    @Override
    public String toString() {
        return "villainClass{" +
                "villainName='" + villainName + '\'' +
                ", lifePoints=" + lifePoints +
                ", attackPoints=" + attackPoints +
                ", deffensePoints=" + deffensePoints +
                '}';
    }
}
