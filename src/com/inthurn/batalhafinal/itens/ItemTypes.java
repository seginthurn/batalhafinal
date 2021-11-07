package com.inthurn.batalhafinal.itens;

public enum ItemTypes {
    LIFEPOTION("Poção Regenerativa", 50), ATTACKPOTION("Poção Energética", 2), DEFENSEPOTION("Poção Protetora", 2);

    private final String description;
    private final Integer buffer;

    ItemTypes(String description, Integer buffer) {
        this.description = description;
        this.buffer = buffer;
    }

    public String getDescription() {
        return description;
    }

    public Integer getBuffer() {
        return buffer;
    }
}
