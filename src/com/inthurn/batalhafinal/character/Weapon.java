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

    public static WeaponType[] castWeapons(CharClass character){
        WeaponType[] weapon = new WeaponType[3];

        switch (character){
            case ARCHER, HUNTER -> {
                weapon[0] = WeaponType.BOW_ARROW;
                weapon[1] = WeaponType.CROSSBOW_BOLTS;
                weapon[2] = WeaponType.DAGGER;
            }

            case WARRIOR, PALADIN -> {
                weapon[0] = WeaponType.SWORD;
                weapon[1] = WeaponType.WARHAMMER;
                weapon[2] = WeaponType.CLUB;
            }

            case MAGE, WARLOCK -> {
                weapon[0] = WeaponType.STAFF;
                weapon[1] = WeaponType.MAGIC_BOOK;
                weapon[2] = WeaponType.MAGICAL_ORB;
            }

        }
        return weapon;
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

}
