package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Venta venta = new Venta();
        try {
            venta.calcularTotal();
        } catch (VentaVaciaException e){
            System.out.println(e.getMessage());
        }

    }
}
