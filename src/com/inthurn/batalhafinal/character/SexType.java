package com.inthurn.batalhafinal.character;

public enum SexType {
    MALE ("Masculino", "seu próximo herói"), FEMALE ("Feminino", "sua próxima heroína");

    SexType(String sex, String diesMessage) {
        this.sex = sex;
        this.diesMessage = diesMessage;
    }

    private String sex;
    private String diesMessage;

    public String getSex() {
        return sex;
    }

    public String getDiesMessage() {
        return diesMessage;
    }
}
