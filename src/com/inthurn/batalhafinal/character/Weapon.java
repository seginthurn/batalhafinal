package com.inthurn.batalhafinal.character;

public final class Weapon {
    private WeaponType weaponType;
    private String weaponName;
    private Integer attackBonus;
    private Integer defenseBonus;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
        this.weaponName = this.weaponType.getWeaponName();
        this.attackBonus = this.weaponType.getAttackBonus();
        this.defenseBonus = this.weaponType.getDefenseBonus();
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Integer getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(Integer attackBonus) {
        this.attackBonus = attackBonus;
    }

    public Integer getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(Integer defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponType=" + weaponType +
                ", weaponName='" + weaponName + '\'' +
                ", attackBonus=" + attackBonus +
                ", defenseBonus=" + defenseBonus +
                '}';
    }
}
