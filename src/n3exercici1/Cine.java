package n3exercici1;

import n3exercici1.exception.*;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de filas:");
        this.filas = scanner.nextInt();
        System.out.println("Introduce el número de asientos por fila:");
        this.asientosFila = scanner.nextInt();
    }

    public void init() {
        int option = menu();
        do {
            switch (option) {
                case 1:
                    showBookedSeats();
                    break;
                case 2:
                    showSeatsByPerson();
                    break;
                case 3:
                    bookSeat();
                    break;
                case 4:
                    cancelBooking();
                    break;
                case 5:
                    cancelPersonBookings();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Introduce una opción válida.");
            }
            option = menu();
        } while (true);
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("1.- Mostrar todas las butacas reservadas");
        System.out.println("2.- Mostrar las butacas reservadas por una persona");
        System.out.println("3.- Reservar una butaca");
        System.out.println("4.- Anular la reserva de una butaca");
        System.out.println("5.- Anular todas las reservas de una persona");
        System.out.println("0.- Salir");
        System.out.println("----------------------------------------------------");
        System.out.println("** Introduce una opción: **");

        opcion = scanner.nextInt();

        return opcion;
    }

    public void showBookedSeats() {
        System.out.println("** Mostrar todas las butacas reservadas **");
        System.out.println(gestionButacas.getButacas());
    }

    public void showSeatsByPerson() {
        System.out.println("** Mostrar todas las butacas reservadas por una persona **");
        String cliente = null;
        try {
            cliente = enterPerson();
        } catch (BadPersonNameException e) {
            System.out.println(e.getMessage());
        }
        String finalCliente = cliente;
        gestionButacas.getButacas().stream().filter(butaca -> butaca.getCliente().equals(finalCliente)).forEach(System.out::println);
    }

    public int enterRow() throws IncorrectRowException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de la fila:");
        int fila = scanner.nextInt();
        if (fila > 1 && fila <= filas) {
            return fila;
        } else {
            throw new IncorrectRowException("Error: La fila introducida no existe.");
        }
    }

    public int enterSeat() throws IncorrectSeatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número del asiento:");
        int asiento = scanner.nextInt();
        if (asiento > 1 && asiento <= asientosFila) {
            return asiento;
        } else {
            throw new IncorrectSeatException("Error: El asiento introducido no existe.");
        }
    }

    public void bookSeat() {
        System.out.println("** Reservar una butaca **");
        try {
            int fila = enterRow();
            int asiento = enterSeat();
            String cliente = enterPerson();
            gestionButacas.addButaca(new Butaca(fila, asiento, cliente));
        } catch (IncorrectRowException | IncorrectSeatException | BadPersonNameException | OcupiedSeatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelBooking() {
        System.out.println("** Cancelar una reserva **");
        try {
            int fila = enterRow();
            int asiento = enterSeat();
            gestionButacas.deleteButaca(new Butaca(fila, asiento));
        } catch (IncorrectSeatException | IncorrectRowException | FreeSeatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelPersonBookings() {
        System.out.println("** Cancelar reservas de una persona **");
        try {
            String cliente = enterPerson();
            gestionButacas.getButacas().removeIf(butaca -> butaca.getCliente().equals(cliente));
        } catch (BadPersonNameException e) {
            System.out.println(e.getMessage());
        }
    }

    public String enterPerson() throws BadPersonNameException {
        Scanner scanner = new Scanner(System.in);
        String cliente;

        System.out.println("Introduce el nombre del cliente:");
        cliente = scanner.nextLine();

        if (cliente.matches("\\d")) throw new BadPersonNameException();

        return cliente;
    }

}
