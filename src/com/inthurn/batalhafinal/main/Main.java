package com.inthurn.batalhafinal.main;
import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.combatsystem.*;

import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Gabriel", HeroClass.WARRIOR, GenderType.MALE, WeaponType.WARHAMMER );
        hero.setPath(PathType.VENGEANCE);
        Villain villain = new Villain("Orc", VillainClass.MEDIC_ORC);
        Combat combat = new Combat(hero, villain, Difficulty.HARD);
        combat.battle();
        System.out.println("Novo Vilão");
        Villain villain2 = new Villain("Orc 2", VillainClass.WAR_ORC);
















    }
}