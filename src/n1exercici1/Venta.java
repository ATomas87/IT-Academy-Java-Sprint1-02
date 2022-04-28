package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Producto> productos;
    private int precioTotal;

    public Venta() {
        this.productos = new ArrayList<>();
        this.precioTotal = 0;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void calcularTotal() throws VentaVaciaException {
        if (productos.isEmpty())
            throw new VentaVaciaException("Para hacer una venta primero tienes que añadir productos.");
        else {
            for (Producto producto : productos) {
                this.precioTotal += producto.getPrecio();
            }
        }
    }
}
