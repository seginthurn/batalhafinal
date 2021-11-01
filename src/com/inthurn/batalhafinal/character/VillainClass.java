package com.inthurn.batalhafinal.character;

public enum VillainClass {
    WAR_ORC("Orc Armeiro", 100, 15, 8), MEDIC_ORC ("Orc ciêntista", 90, 15, 5),  BOSS("O Líder", 150, 20, 10);

    private String vilainName;
    private Integer lifePoints;
    private Integer attackPoints;
    private Integer deffensePoints;

    VillainClass(String vilainName, Integer lifePoints, Integer attackPoints, Integer deffensePoints) {
        this.vilainName = vilainName;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.deffensePoints = deffensePoints;
    }

    public String getVilainName() {
        return vilainName;
    }

    public void setVilainName(String vilainName) {
        this.vilainName = vilainName;
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
        return "VilainClass{" +
                "vilainName='" + vilainName + '\'' +
                ", lifePoints=" + lifePoints +
                ", attackPoints=" + attackPoints +
                ", deffensePoints=" + deffensePoints +
                '}';
    }
}
