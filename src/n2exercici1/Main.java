package n2exercici1;

public class Main {
    public static void main(String[] args) {
        byte enterByte = Entrada.readByte("Introduce un byte:");
        char enterChar = Entrada.readChar("Introduce un carácter:");
        double enterDouble = Entrada.readDouble("Introduce un número con decimales:");
        float enterFloat = Entrada.readFloat("Introduce un número con decimales:");
        int enterInt = Entrada.readInt("Introduce un número entero:");
        String enterString = Entrada.readString("Introduce una frase:");
        boolean enterYesNo = Entrada.readYesNo("¿Te gustan los macarrones? S/N:");

        System.out.println("Byte: " + enterByte
                + ", Char: " + enterChar
                + ", Double: " + enterDouble
                + ", Float: " + enterFloat
                + ", Int: " + enterInt
                + ", String: " + enterString
                + ", Boolean: " + enterYesNo);
    }

}
