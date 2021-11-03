package com.inthurn.batalhafinal.character;

import java.util.Random;

public class Villain extends Character {
    private VillainClass villainClass;
    private Weapon villainWeapon;

    public Villain(String name, VillainClass villainClass) {
        super(name);
        this.villainClass = villainClass;
        this.villainWeapon = randomWeapon();
        this.setLifePoints(this.villainClass.getLifePoints());
        this.setAttackPoints(this.villainClass.getAttackPoints() + this.villainWeapon.getAttackBonus());
        this.setDefensePoints(this.villainClass.getDeffensePoints() + this.villainWeapon.getDefenseBonus());
        this.setDead(false);
    }


    private final Weapon randomWeapon() {
        Random random = new Random();
        WeaponType choice;
        Integer option = random.nextInt(8);
        if(option == 0){
            option = random.nextInt(8);
        }
        switch (option) {
            case 1:
                choice = WeaponType.SWORD;
                break;
            case 2:
                choice = WeaponType.AXE;
                break;
            case 3:
                choice = WeaponType.WARHAMMER;
                break;
            case 4:
                choice = WeaponType.CLUB;
                break;
            case 5:
                choice = WeaponType.BOW_ARROW;
                break;
            case 6:
                choice = WeaponType.CROSSBOW_BOLTS;
                break;
            case 7:
                choice = WeaponType.STAFF;
                break;
            case 8:
                choice = WeaponType.MAGIC_BOOK;
                break;
            default:
                return null;
        }

        //SWORD("Espada", 7, 5),
        // AXE("Machado", 8, 4),
        // WARHAMMER("Machado de Guerra", 10, 2),
        // CLUB ("Clava", 9, 3),
        // BOW_ARROW ("Arco e Flecha" , 12, 1),
        // CROSSBOW_BOLTS("Besta e Virotes", 11, 2),
        // STAFF ("Cajado", 8,5),
        // MAGIC_BOOK ("Livro Mágico", 9, 4);

        Weapon villainWeapon = new Weapon(choice);
        return villainWeapon;

    }



    @Override
    public String toString() {
        return "Vilain{" +
                "vilainClass=" + villainClass +
                ", villainWeapon=" + villainWeapon +
                '}';
    }
}
