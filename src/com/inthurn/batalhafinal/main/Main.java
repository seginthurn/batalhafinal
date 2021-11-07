package com.inthurn.batalhafinal.main;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.storytelling.Story;
import com.inthurn.batalhafinal.utils.GameLogo;


public class Main {
    public static void main(String[] args) {
        GameLogo.showLogo();
        System.out.println();
        HeroCreator creator = new HeroCreator();
        Hero hero = new Hero(creator.getName(), creator.getCharClass(), creator.getSex(), creator.getWeaponType());
        Story story = new Story(hero, creator.getDifficulty());
        story.tell();
    }
}