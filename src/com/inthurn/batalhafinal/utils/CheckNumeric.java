package com.inthurn.batalhafinal.utils;

import java.util.Scanner;

public class CheckNumeric {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
