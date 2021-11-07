package com.inthurn.batalhafinal.character;

import com.inthurn.batalhafinal.itens.*;

public class Hero extends Character {
    private PathType path;
    private SexType sex;
    private Weapon weapon;
    private CharClass charClass;
    private Item[][] items;

    public Hero(String name, CharClass charClass, SexType sex, WeaponType weaponType) {
        super(name);
        this.setCharClass(charClass);
        this.setLifePoints(charClass.getLifePoints());
        this.setWeapon(new Weapon(weaponType));
        this.setDefensePoints(charClass.getDefense() + this.weapon.getDefenseBonus());
        this.setAttackPoints(charClass.getAttack() + this.weapon.getAttackBonus());
        this.setSex(sex);
        this.setDead(false);
        this.setItems();
    }


    @Override
    public void showStatus() {
        System.out.println("\n");
        System.out.println("----------------------------------------------");
        System.out.println("Herói: " + this.getName());
        System.out.println("Classe: " + this.getCharClass().getType());
        System.out.println("Arma equipada: " + this.getWeapon().getWeaponName());
        System.out.println("Pontos de Vida: " + this.getLifePoints());
        System.out.println("Pontos da Ataque: " + this.getAttackPoints());
        System.out.println("Pontos de Defesa: " + this.getDefensePoints());
        System.out.println("----------------------------------------------");
        System.out.println("\n");
    }


    public void setItems() {
        Item[] attackPotion = {new Item(ItemTypes.ATTACKPOTION), new Item(ItemTypes.ATTACKPOTION), new Item(ItemTypes.ATTACKPOTION)};
        Item[] potion = {new Item(ItemTypes.LIFEPOTION), new Item(ItemTypes.LIFEPOTION), new Item(ItemTypes.LIFEPOTION)};
        Item[] defensePotion = {new Item(ItemTypes.DEFENSEPOTION), new Item(ItemTypes.DEFENSEPOTION), new Item(ItemTypes.DEFENSEPOTION),};
        this.items = new Item[][]{attackPotion, potion, defensePotion};
    }

    @Override
    public void useItem(ItemTypes itemTypes) {
        String message = null;

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                if (items[i][j] == null) {
                    continue;
                }
                if (items[i][j].getItemType() == itemTypes) {
                    items[i][j].setBuffer(this);
                    items[i][j] = null;
                    return;
                } else if (items[i][j].getItemType() != itemTypes) {
                    message = "Você não tem mais este item!";
                }
            }
        }

        if (message != null) {
            System.out.println(message);
            System.out.println("O inimigo percebeu sua falta de atenção e agiu...");
        }
    }

    @Override
    public void listItem() {
        String potion = null;
        String attackPotion = null;
        String defensePotion = null;

        for (int i = 0; i < this.items.length; i++) {
            for (int j = 0; j < this.items[i].length; j++) {

                if (this.items[i][j] == null) {
                    continue;
                }

                switch (items[i][j].getItemType()) {
                    case LIFEPOTION -> potion = ItemTypes.LIFEPOTION.getDescription();
                    case ATTACKPOTION -> attackPotion = ItemTypes.ATTACKPOTION.getDescription();
                    case DEFENSEPOTION -> defensePotion = ItemTypes.DEFENSEPOTION.getDescription();
                }


            }
        }

        System.out.println("Seus items são: ");

        if (potion != null) {
            System.out.println(potion);
        }

        if (attackPotion != null) {
            System.out.println(attackPotion);
        }

        if (defensePotion != null) {
            System.out.println(defensePotion);
        }

    }


    public PathType getPath() {
        return path;
    }

    public void setPath(PathType path) {
        this.path = path;
    }

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public CharClass getCharClass() {
        return charClass;
    }

    public void setCharClass(CharClass charClass) {
        this.charClass = charClass;
    }

    public WeaponType getWeaponType() {
        return this.weapon.getWeaponType();
    }
}
