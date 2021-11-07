package com.inthurn.batalhafinal.combatsystem;

public interface CombatActions {
    void battle();

    void setDifficultyBonus();

    void useItem();

    void attack(Integer dice);
}
