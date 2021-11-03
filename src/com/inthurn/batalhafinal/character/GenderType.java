package com.inthurn.batalhafinal.character;

public enum GenderType {
    MALE ("Masculino", "seu próximo herói"), FEMALE ("Feminino", "sua próxima heroína");

    GenderType(String gender, String diesMessage) {
        this.gender = gender;
        this.diesMessage = diesMessage;
    }

    private String gender;
    private String diesMessage;

    public String getGender() {
        return gender;
    }

    public String getDiesMessage() {
        return diesMessage;
    }
}
