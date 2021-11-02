package com.inthurn.batalhafinal.utils;

import java.util.Random;

public class DiceRoll {
    public static Integer roll(){
        Random random = new Random();
        Integer dice = random.nextInt(20);
        return dice;
    }


}
