package com.inthurn.batalhafinal.character;

public enum WeaponType {
    SWORD("Espada", 7, 5, " com sua ESPADA "),
    AXE("Machado", 8, 4, " com seu MACHADO "),
    WARHAMMER("Machado de Guerra", 10, 2, " com seu MARTELO DE GUERRA "),
    CLUB("Clava", 9, 3, " com sua CLAVA "),
    BOW_ARROW("Arco e Flecha", 12, 1, " com seu ARCO, e a FLECHA o atingiu "),
    CROSSBOW_BOLTS("Besta e Virotes", 11, 2, " com sua BESTA, e o VIROTE o atingiu "),
    DAGGER("Adaga", 10, 3, " com sua ADAGA "),
    SPEAR("LANÇA", 10, 3, " com sua LANÇA "),
    STAFF("Cajado", 8, 5, " com seu CAJADO, lançando uma bola de fogo e "),
    MAGICAL_ORB("Orb Mágico", 10, 3, " sugando a energia dele com seu ORBE MÁGICO, "),
    MAGIC_BOOK("Livro Mágico", 9, 4, " absorvendo energia do LIVRO com uma mão e liberando com a outra "),
    MAGICAL_BLADE("Lâmina Mágica", 10,4," com sua LÂMINA MÁGICA ");

    private final String weaponName;
    private final Integer attackBonus;
    private final Integer defenseBonus;
    private final String attackMessage;

    WeaponType(String weaponName, Integer attackBonus, Integer defenseBonus, String attackMessage) {
        this.weaponName = weaponName;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.attackMessage = attackMessage;
    }

    public String getWeaponName() {
        return weaponName;
    }


    public Integer getAttackBonus() {
        return attackBonus;
    }


    public Integer getDefenseBonus() {
        return defenseBonus;
    }


    public String getAttackMessage() {
        return attackMessage;
    }
}
