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
                System.out.println("Error. Asegúrate de introducir sólo un byte.");
                scanner.nextLine();
            }
        } while (!correct);
        return userByte;
    }

    public static int readInt(String message) {
        int userInt = 0;
        boolean correct = false;
        do {
            System.out.println(message);
            try {
                userInt = scanner.nextInt();
                correct = true;
            } catch (InputMismatchException e){
                System.out.println("Error. Has introducido un dato que no se corresponde con un número entero.");
                scanner.nextLine();
            }
        } while (!correct);
        return userInt;
    }

    public static float readFloat(String message) {
        float userFloat = 0;
        boolean correct = false;
        do {
            System.out.println(message);
            try {
                userFloat = scanner.nextFloat();
                correct = true;
            } catch (InputMismatchException e){
                System.out.println("Error. Asegúrate de utilizar una coma en lugar de un punto para introducir el número decimal.");
                scanner.nextLine();
            }
        } while (!correct);
        return userFloat;
    }

    public static double readDouble(String message) {
        double userDouble = 0;
        boolean correct = false;
        do {
            System.out.println(message);
            try {
                userDouble = scanner.nextDouble();
                correct = true;
            } catch (InputMismatchException e){
                System.out.println("Error. Asegúrate de utilizar una coma en lugar de un punto para introducir el número decimal.");
                scanner.nextLine();
            }
        } while (!correct);
        return userDouble;
    }

    public static char readChar(String message) {
        char userChar = Character.MIN_VALUE;
        boolean correct = false;
        do {
            System.out.println(message);
            try {
                userChar = scanner.next(".").charAt(0);
                correct = true;
            } catch (Exception e){
                System.out.println("Error. Has introducido más de un carácter.");
                scanner.nextLine();
            }
        } while (!correct);
        return userChar;
    }

    public static String readString(String message) {
        String userString = "";
        boolean correct = false;
        do {
            System.out.println(message);
            try {
                userString = scanner.nextLine();
                correct = true;
            } catch (Exception e){
                System.out.println("Error. El dato introducido no es una cadena de texto.");
                scanner.nextLine();
            }
        } while (!correct);
        return userString;
    }

    public static boolean readYesNo(String message) {
        char userBoolean;
        do {
            System.out.println(message);
            try {
                userBoolean = scanner.next("[sSnN]").charAt(0);
                if (userBoolean == 's' || userBoolean == 'S'){
                    return true;
                } else if (userBoolean == 'n' || userBoolean == 'N'){
                    return false;
                }
            } catch (Exception e){
                System.out.println("Error. Asegúrate de responder correctamente (S/N).");
                scanner.nextLine();
            }
        } while (true);
    }
}
