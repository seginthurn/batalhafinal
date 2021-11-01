package com.inthurn.batalhafinal.character;

public enum WeaponType {
    SWORD("Espada", 7, 5),
    AXE("Machado", 8, 4),
    WARHAMMER("Machado de Guerra", 10, 2),
    CLUB ("Clava", 9, 3),
    BOW_ARROW ("Arco e Flecha" , 12, 1),
    CROSSBOW_BOLTS("Besta e Virotes", 11, 2),
    STAFF ("Cajado", 8,5),
    MAGIC_BOOK ("Livro Mágico", 9, 4);

    private String weaponName;
    private Integer attackBonus;
    private Integer defenseBonus;

    WeaponType(String weaponName, Integer attackBonus, Integer defenseBonus) {
        this.weaponName = weaponName;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
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
