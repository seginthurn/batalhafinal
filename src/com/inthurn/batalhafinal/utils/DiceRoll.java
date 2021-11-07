package com.inthurn.batalhafinal.utils;

import java.util.Random;

public class DiceRoll {
    public static Integer roll() {
        Random random = new Random();
        Integer dice = random.nextInt(20);
        if (dice == 0) {
            dice = DiceRoll.roll();
        }
        return dice;
    }

    public static Integer roll(Integer bound) {
        Random random = new Random();
        Integer dice = random.nextInt(bound);
        if (dice == 0) {
            dice = DiceRoll.roll();
        }
        return dice;
    }


}
