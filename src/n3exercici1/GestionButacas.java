package n3exercici1;

import n3exercici1.exception.FreeSeatException;
import n3exercici1.exception.OcupiedSeatException;

import java.util.ArrayList;
import java.util.List;

public class GestionButacas {
    private List<Butaca> butacas;

    public GestionButacas() {
        this.butacas = new ArrayList<>();
    }

    public List<Butaca> getButacas() {
        return butacas;
    }

    public void addButaca(Butaca butaca) throws OcupiedSeatException {
        if (searchButaca(butaca.getFila(), butaca.getAsiento()) == -1) {
            this.butacas.add(butaca);
        } else {
            throw new OcupiedSeatException("Error. La butaca ya está ocupada.");
        }
    }

    public void deleteButaca(Butaca butaca) throws FreeSeatException {
        if (searchButaca(butaca.getFila(), butaca.getAsiento()) == -1) {
            throw new FreeSeatException("Error. La butaca está vacía.");
        } else {
            this.butacas.remove(butaca);
        }
    }

    public int searchButaca(int fila, int asiento) {
        return this.butacas.indexOf(new Butaca(fila, asiento));
    }
}
