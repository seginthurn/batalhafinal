package com.inthurn.batalhafinal.utils;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {

    public static Integer scanInteger() {
        Scanner scanner = new Scanner(System.in);
        Integer num;

        try {
            System.out.println("\n");
            System.out.print("Responder -> ");
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida");
            num = Keyboard.scanInteger();
        }

        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        return num;
    }

    public static String scanString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Inserir -> ");
        String string = scanner.nextLine();
        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");

        return string;
    }

    public static void pressEnterToContinue() {
        System.out.println("\n");
        System.out.println("Aperte \"ENTER\" para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {

        }
        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
    }


}
