package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public Entrada() {
    }

    public static byte readByte(String message) {
        byte userByte = 0;
        boolean correct = false;
        do {
            System.out.println(message);
            try {
                userByte = scanner.nextByte();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("El dato introducido no se corresponde con el tipo de dato esperado.");
                scanner.nextLine();
            }
        } while (!correct);
        return userByte;
    }

//    public static int readInt(String message) {
//
//    }
//
//    public static float readFloat(String message) {
//
//    }
//
//    public static double readDouble(String message) {
//
//    }
//
//    public static char readChar(String message) {
//
//    }
//
//    public static String readString(String message) {
//
//    }
//
//    public static boolean readYesNo(String message) {
//
//    }
}
