package com.inthurn.batalhafinal.main;
import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.combatsystem.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Gabriel", HeroClass.WARRIOR, GenderType.MALE, WeaponType.WARHAMMER );
        Villain villain = new Villain("Orc", VillainClass.MEDIC_ORC);
        Combat combat = new Combat(hero, villain, Difficulty.HARD);
        combat.battle();

        System.out.println(hero.getAttackPoints());
        System.out.println(villain.getAttackPoints());







    }
}