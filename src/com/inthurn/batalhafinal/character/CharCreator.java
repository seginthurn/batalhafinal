package com.inthurn.batalhafinal.character;

import java.util.Scanner;

public class CharCreator {
    private static Integer difficulty;
    private static String heroName;
    private static SexType sex;
    private static CharClass charClass;
    private static WeaponType weaponType;

    public Hero criarHeroi(){
        int numSwitch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inisira o nome do herói");
        this.heroName = scanner.nextLine();
        System.out.println("Você escolheu o nome " + this.heroName);


        do{
            System.out.println("Insira o sexo do herói");
            numSwitch = scanner.nextInt();
            switch (numSwitch){
                case 1:
                    this.sex = SexType.MALE;
                    break;
                case 2:
                    this.sex = SexType.FEMALE;
                    break;
                default:
                    System.out.println("Opção Inválida, digite novamente");
            }
        }while(numSwitch <1 && numSwitch > 2);
        System.out.println("VocE");
        System.out.println("Insira a classe do herói");
        System.out.println("Insira uma arma para o herói");

        Hero hero = new Hero(this.heroName, CharClass.WARRIOR, this.sex, WeaponType.WARHAMMER );
        return hero;
    }


    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public SexType getsex() {
        return sex;
    }

    public void setsex(SexType sex) {
        this.sex = sex;
    }

    public CharClass getHeroClass() {
        return charClass;
    }

    public void setHeroClass(CharClass charClass) {
        this.charClass = charClass;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
