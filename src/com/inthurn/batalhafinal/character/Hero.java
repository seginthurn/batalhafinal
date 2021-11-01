package com.inthurn.batalhafinal.character;

public class Hero extends Character{
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
