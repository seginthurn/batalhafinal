package com.inthurn.batalhafinal.character;

public enum PathType {
    GLORY("A glória que buscavas não será sua, e a cidade aguarda por"),
    VENGEANCE("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");

    PathType(String diesMessage) {
        this.diesMessage = diesMessage;
    }

    private String diesMessage;

    public String getDiesMessage() {
        return diesMessage;
    }
}
