package com.inthurn.batalhafinal.main;
import com.inthurn.batalhafinal.character.CharClass;
import com.inthurn.batalhafinal.character.CharCreator;
import com.inthurn.batalhafinal.character.Weapon;
import com.inthurn.batalhafinal.character.WeaponType;
import com.inthurn.batalhafinal.combatsystem.Difficulty;
import com.inthurn.batalhafinal.storytelling.Story;
import com.inthurn.batalhafinal.utils.HeroCreator;
import com.inthurn.batalhafinal.utils.Keyboard;
import com.inthurn.batalhafinal.character.Hero;


import java.security.Key;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" +
                "██████╗  █████╗ ████████╗ █████╗ ██╗     ██╗  ██╗ █████╗     ███████╗██╗███╗   ██╗ █████╗ ██╗     \n" +
                "██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██║     ██║  ██║██╔══██╗    ██╔════╝██║████╗  ██║██╔══██╗██║     \n" +
                "██████╔╝███████║   ██║   ███████║██║     ███████║███████║    █████╗  ██║██╔██╗ ██║███████║██║     \n" +
                "██╔══██╗██╔══██║   ██║   ██╔══██║██║     ██╔══██║██╔══██║    ██╔══╝  ██║██║╚██╗██║██╔══██║██║     \n" +
                "██████╔╝██║  ██║   ██║   ██║  ██║███████╗██║  ██║██║  ██║    ██║     ██║██║ ╚████║██║  ██║███████╗\n" +
                "╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝\n" +
                "                                                                                                  \n");


        //Hero hero = new Hero("Gabriel", CharClass.WARRIOR, GenderType.MALE, WeaponType.WARHAMMER );
        //hero.setPath(PathType.VENGEANCE);
        //Villain villain = new Villain("Orc", VillainClass.MEDIC_ORC);
        //Combat combat = new Combat(hero, villain, null);
        //combat.battle();
        //System.out.println("Novo Vilão");
        //Villain villain2 = new Villain("Orc 2", VillainClass.WAR_ORC);

        //System.out.println(creator.getCharClass());
        //System.out.println(creator.getDifficulty().getDescription());
        //System.out.println(creator.getName());
        //creator.setSex();

        //WeaponType [] weapon;
        //weapon = Weapon.castWeapons(CharClass.ARCHER);
        //System.out.println(weapon[1].getWeaponName());

        //HeroCreator creator = new HeroCreator();
        //Hero hero = new Hero(creator.getName(), creator.getCharClass(), creator.getSex(),creator.getWeaponType());
        Story story = new Story(Difficulty.MEDIUM);
        story.tell();




























    }
}