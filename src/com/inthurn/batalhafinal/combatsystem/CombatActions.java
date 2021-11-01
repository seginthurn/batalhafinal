package com.inthurn.batalhafinal.combatsystem;

import com.inthurn.batalhafinal.character.*;

public interface CombatActions {
    public abstract Integer rollDice();
    public abstract void battle(Hero hero, Villain villain);
    public abstract void setDifficultyBonus();
}
