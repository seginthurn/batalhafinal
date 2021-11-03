package com.inthurn.batalhafinal.character;

import com.inthurn.batalhafinal.utils.DiceRoll;

public class Hero extends Character {
    private PathType path;
    private GenderType gender;
    private Weapon weapon;
    private HeroClass heroClass;


    public Hero(String name, HeroClass heroClass, GenderType gender, WeaponType weaponType) {
        super(name);
        this.heroClass = heroClass;
        this.setLifePoints(heroClass.getLifePoints());
        this.weapon = new Weapon(weaponType);
        this.setDefensePoints(heroClass.getDefense() + this.weapon.getDefenseBonus());
        this.setAttackPoints(heroClass.getAttack() + this.weapon.getAttackBonus());
        this.path = path;
        this.gender = gender;
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

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    @Override
    public String toString() {
        return "Hero{" +
                "path=" + path +
                ", gender=" + gender +
                ", weapon=" + weapon +
                ", heroClass=" + heroClass +
                '}';
    }
}
