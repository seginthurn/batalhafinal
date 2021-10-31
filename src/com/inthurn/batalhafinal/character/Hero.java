package com.inthurn.batalhafinal.character;

public class Hero extends Character{
    private PathType path;
    private GenderType gender;
    //private Weapon weapon;
    private HeroClass heroClass;

    public Hero(String name, HeroClass heroClass, GenderType gender) {
        super(name);
        this.heroClass = heroClass;
        this.setLifePoints(heroClass.getLifePoints());
        this.setDefensePoints(heroClass.getDefense());
        this.setAttackPoints(heroClass.getAttack());
        this.path = path;
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Hero{" +
                "path=" + path +
                ", gender=" + gender +
                ", heroClass=" + heroClass +
                '}';
    }
}
