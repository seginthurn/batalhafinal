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


    @Override
    public void showStatus() {
        System.out.println("\n");
        System.out.println("----------------------------------------------");
        System.out.println("Inimigo: " + this.villainClass.getVillainName());
        System.out.println("Classe: " + this.villainClass.getClass());
        System.out.println("Arma equipada: " + this.getVillainWeapon().getWeaponName());
        System.out.println("Pontos de Vida: " + this.getLifePoints());
        System.out.println("Pontos da Ataque: " + this.getAttackPoints());
        System.out.println("Pontos de Defesa: " + this.getDefensePoints());
        System.out.println("----------------------------------------------");
        System.out.println("\n");
    }

    private final Weapon randomWeapon() {
        Random random = new Random();
        WeaponType choice;
        Integer option = random.nextInt(8);
        if(option == 0){
            option = random.nextInt(7) + 1;
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




        Weapon villainWeapon = new Weapon(choice);
        return villainWeapon;

    }

    public VillainClass getVillainClass() {
        return villainClass;
    }

    public void setVillainClass(VillainClass villainClass) {
        this.villainClass = villainClass;
    }

    public Weapon getVillainWeapon() {
        return villainWeapon;
    }

    public void setVillainWeapon(Weapon villainWeapon) {
        this.villainWeapon = villainWeapon;
    }

    @Override
    public String toString() {
        return "Vilain{" +
                "vilainClass=" + villainClass +
                ", villainWeapon=" + villainWeapon +
                '}';
    }
}
