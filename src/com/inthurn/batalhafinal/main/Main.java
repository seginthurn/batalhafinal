package com.inthurn.batalhafinal.main;
import com.inthurn.batalhafinal.character.*;

public class Main {
    public static void main(String[] args) {

    Hero hero = new Hero("Goham",
            HeroClass.WARLOCK,
            GenderType.MALE);

    hero.setPath(PathType.GLORY);

    System.out.println(hero.toString());
    }
}
