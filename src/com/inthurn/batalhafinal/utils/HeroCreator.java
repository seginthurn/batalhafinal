package com.inthurn.batalhafinal.utils;

import com.inthurn.batalhafinal.character.*;
import com.inthurn.batalhafinal.combatsystem.Difficulty;

import java.util.Scanner;

public final class HeroCreator {
    private String name;
    private Difficulty difficulty;
    private SexType sex;
    private CharClass charClass;
    private WeaponType weaponType;
    private Scanner scanner = new Scanner(System.in);

    public HeroCreator() {
        this.setDifficulty();
        System.out.println("<-------------------------->");
        this.setName();
        System.out.println("<-------------------------->");
        this.setSex();
        System.out.println("<-------------------------->");
        this.setCharClass();
        System.out.println("<-------------------------->");
        this.setWeaponType();

    }


    public String getName() {
        return name;
    }

    public void setName() {
        Integer option;
        Boolean exit = false;

        while (exit == false) {
            System.out.println("Escolha o seu nome: ");
            this.name = Keyboard.scanString();
            if(this.name.isBlank()){
                System.out.println("Seu nome não pode estar em branco!");
                System.out.println("<-------------------------->");
                continue;
            }

            if(CheckNumeric.isNumeric(this.name)){
                System.out.println("Seu nome não pode ser um número!");
                System.out.println("<-------------------------->");
                continue;
            }

            System.out.println("O seu nome será: " + this.getName() + " e não poderá ser alterado.");
            System.out.println("Deseja continuar?");
            System.out.println("1 - Sim, " + this.getName() + " é um bom nome!");
            System.out.println("2 - Não, mudei de ideia");

            option = Keyboard.scanInteger();

            switch (option){
                case 1:
                    exit = true;
                    break;
                case 2:
                    continue;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    System.out.println("<-------------------------->");
            }

        }
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty() {
        Boolean exit = false;
        Integer option = 0;

        while (exit == false) {
            System.out.println("Escolha seu nível de dificuldade \n");

            System.out.println("1 - Fácil");
            System.out.println("2 - Normal");
            System.out.println("3 - Difícil");
            System.out.println("<-------------------------->");
            option = Keyboard.scanInteger();

            switch (option) {
                case 1:
                    this.difficulty = Difficulty.EASY;
                    break;
                case 2:
                    this.difficulty = Difficulty.MEDIUM;
                    break;
                case 3:
                    this.difficulty = Difficulty.HARD;
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente");
                    System.out.println("<-------------------------->");
                    continue;
            }
            System.out.println("<-------------------------->");
            System.out.println("A dificuldade será configurada para  " + this.difficulty.getDescription() + " e não poderá ser alterada.");
            System.out.println("Deseja continuar? \n");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.println("<-------------------------->");
            option = Keyboard.scanInteger();
            switch (option) {
                case 1:
                    exit = true;
                    break;
                case 2:
                    continue;
                default:
                    System.out.println("Opção inválida, digite novamente");
                    System.out.println("<-------------------------->");

            }
        }
    }

    public SexType getSex() {
        return sex;
    }

    public void setSex() {

        Integer option;
        System.out.println("Escolha seu sexo: \n");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        option = Keyboard.scanInteger();

        switch (option) {
            case 1:
                this.sex = SexType.MALE;
                break;
            case 2:
                this.sex = SexType.FEMALE;
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                setSex();
        }

        System.out.println("O sexo escolhido foi: " + this.getSex().getSex() + " deseja alterar?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        option = Keyboard.scanInteger();

        switch (option) {
            case 1:
                setSex();
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                setSex();
        }
    }

    public CharClass getCharClass() {
        return charClass;
    }

    public void setCharClass() {
        Integer option;
        Boolean done = false;

        while (!done){
            System.out.println("Selecione a sua Classe: \n");
            for (CharClass s : CharClass.values()) {
                System.out.println((s.ordinal() + 1) + " - " + s.getType());
            }

            option = Keyboard.scanInteger();

            switch (option){
                case 1:
                    this.charClass = CharClass.ARCHER;
                    break;
                case 2:
                    this.charClass = CharClass.HUNTER;
                    break;
                case 3:
                    this.charClass = CharClass.WARRIOR;
                    break;
                case 4:
                    this.charClass = CharClass.PALADIN;
                    break;
                case 5:
                    this.charClass = CharClass.MAGE;
                    break;
                case 7:
                    this.charClass = CharClass.WARLOCK;
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente");
                    continue;

            }

            System.out.println("A Classe escolhida foi: " + this.charClass.getType());
            System.out.println("Deseja alterar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            option = Keyboard.scanInteger();
            switch (option){
                case 1:
                    this.setCharClass();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente");
                    continue;
            }
            done = true;
        }

    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType() {
        Boolean done = false;
        Integer option;

        while (!done){
            System.out.println("Selecione a sua Arma: \n");
            WeaponType [] weapon;

            weapon = Weapon.castWeapons(this.charClass);

            System.out.println("1 - " + weapon[0].getWeaponName());
            System.out.println("2 - " + weapon[1].getWeaponName());
            System.out.println("3 - " + weapon[2].getWeaponName());
            option = Keyboard.scanInteger();
            this.weaponType = weapon[option - 1];
            System.out.println("A arma escolhida foi: " + this.weaponType.getWeaponName());
            System.out.println("Deseja alterar? \n");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            option = Keyboard.scanInteger();

            switch (option){
                case 1:
                    this.setWeaponType();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente");
                    continue;
            }
            done = true;
        }


    }
}
