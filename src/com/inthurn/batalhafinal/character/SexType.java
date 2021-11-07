package com.inthurn.batalhafinal.character;

public enum SexType {
    MALE ("Masculino", "seu próximo herói"), FEMALE ("Feminino", "sua próxima heroína");

    SexType(String sex, String diesMessage) {
        this.sex = sex;
        this.diesMessage = diesMessage;
    }

    private final String sex;
    private final String diesMessage;

    public String getSex() {
        return sex;
    }

    public String getDiesMessage() {
        return diesMessage;
    }
}
