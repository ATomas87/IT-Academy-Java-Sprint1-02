package n3exercici1;

public class Butaca {
    private int fila;
    private int asiento;
    private String cliente;

    public Butaca(int fila, int asiento, String cliente) {
        this.fila = fila;
        this.asiento = asiento;
        this.cliente = cliente;
    }

    public Butaca(int fila, int asiento) {
        this.fila = fila;
        this.asiento = asiento;
    }

    public int getFila() {
        return fila;
    }


    public int getAsiento() {
        return asiento;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public boolean equals(Object obj) {
        Butaca otherButaca = (Butaca) obj;
        return otherButaca.getAsiento() == this.asiento && otherButaca.getFila() == this.fila;
    }

    @Override
    public String toString() {
        return "Fila: " + this.fila + ", Asiento: " + this.asiento + ", Persona: " + this.cliente;
    }
}
