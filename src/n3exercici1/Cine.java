package n3exercici1;

import java.util.Scanner;

public class Cine {
    private int filas;
    private int asientosFila;
    private GestionButacas gestionButacas;

    public Cine() {
        this.gestionButacas = new GestionButacas();
        getInitialData();
    }

    private void getInitialData() {
    }

    public void init(){
        int option = menu();
    }

    public int menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("1.- Mostrar todas las butacas reservadas");
        System.out.println("2.- Mostrar las butacas reservadas por una persona");
        System.out.println("3.- Reservar una butaca");
        System.out.println("4.- Anular la reserva de una butaca");
        System.out.println("5.- Anular todas las reservas de una persona");
        System.out.println("0.- Salir");
        System.out.printf("----------------------------------------------------");
        System.out.printf("** Introduce una opción: **");

        opcion = scanner.nextInt();

        return opcion;
    }

    public void showBookedSeats(){

    }

    public void showSeatsByPerson(String cliente){

    }

    public void bookSeat(){

    }

    public String enterPerson() throws BadPersonNameException {
        Scanner scanner = new Scanner(System.in);
        String cliente;

        System.out.println("** Introduce tu nombre **");
        cliente = scanner.nextLine();

        if (cliente.matches("\\d")) throw new BadPersonNameException();
        
        return cliente;
    }

}
