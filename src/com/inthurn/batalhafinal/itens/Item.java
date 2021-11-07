package com.inthurn.batalhafinal.itens;

import com.inthurn.batalhafinal.character.Character;
import com.inthurn.batalhafinal.utils.Keyboard;

public class Item {
    private String description;
    private ItemTypes itemType;

    public Item(ItemTypes itemType) {
        this.setDescription(itemType.getDescription());
        this.setItemType(itemType);
    }

    public void setBuffer(Character character) {
        switch (itemType) {
            case ATTACKPOTION -> {
                character.setAttackPoints(character.getAttackPoints() + this.itemType.getBuffer());
                System.out.println("Você utilizou a " + this.itemType.getDescription() + " e ganhou " + this.itemType.getBuffer() + " pontos de ataque!");
                Keyboard.pressEnterToContinue();
            }
            case LIFEPOTION -> {
                character.setLifePoints(character.getLifePoints() + this.itemType.getBuffer());
                System.out.println("Você utilizou a " + this.itemType.getDescription() + " e recuperou " + this.itemType.getBuffer() + " pontos de vida!!");
                Keyboard.pressEnterToContinue();
            }
            case DEFENSEPOTION -> {
                character.setDefensePoints(character.getDefensePoints() + this.itemType.getBuffer());
                System.out.println("Você utilizou a " + this.itemType.getDescription() + " e ganhou " + this.itemType.getBuffer() + " pontos de defesa!!");
                Keyboard.pressEnterToContinue();
            }
        }

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemTypes getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypes itemType) {
        this.itemType = itemType;
    }
}
