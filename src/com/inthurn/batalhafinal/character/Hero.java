package com.inthurn.batalhafinal.character;

import com.inthurn.batalhafinal.combatsystem.Difficulty;
import com.inthurn.batalhafinal.utils.DiceRoll;

public class Hero extends Character {
    private PathType path;
    private SexType sex;
    private Weapon weapon;
    private CharClass charClass;



    public Hero(String name, CharClass charClass, SexType sex, WeaponType weaponType) {
        super(name);
        this.charClass = charClass;
        this.setLifePoints(charClass.getLifePoints());
        this.weapon = new Weapon(weaponType);
        this.setDefensePoints(charClass.getDefense() + this.weapon.getDefenseBonus());
        this.setAttackPoints(charClass.getAttack() + this.weapon.getAttackBonus());
        this.path = path;
        this.sex = sex;
        this.setDead(false);
    }


    @Override
    public void showStatus() {
        System.out.println("\n");
        System.out.println("----------------------------------------------");
        System.out.println("Herói: " + this.getName());
        System.out.println("Classe: " + this.getHeroClass().getType());
        System.out.println("Arma equipada: " + this.getWeapon().getWeaponName());
        System.out.println("Pontos de Vida: " + this.getLifePoints());
        System.out.println("Pontos da Ataque: " + this.getAttackPoints());
        System.out.println("Pontos de Defesa: " + this.getDefensePoints());
        System.out.println("----------------------------------------------");
        System.out.println("\n");
    }


    public PathType getPath() {
        return path;
    }

    public void setPath(PathType path) {
        this.path = path;
    }

    public SexType getsex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public CharClass getHeroClass() {
        return charClass;
    }

    public void setHeroClass(CharClass charClass) {
        this.charClass = charClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}
