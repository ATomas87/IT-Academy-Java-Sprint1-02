package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Venta venta = new Venta();
        try {
            venta.calcularTotal();
        } catch (VentaVaciaException e){
            System.out.println(e.getMessage());
        }

        String[] saludo = {"Hola", "mundo"};
        try{
            System.out.println(saludo[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Vaya, parece que estás accediendo a una posición del array que no existe.");
            //e.printStackTrace();
        }
    }
}
