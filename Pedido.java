import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Platillo> platillos;

    public Pedido() {
        platillos = new ArrayList<>();
    }

    public void agregarPlatillo(Platillo platillo) {
        platillos.add(platillo);
        System.out.println("Platillo agregado: " + platillo.getNombre());
    }

    public double calcularTotal() {
        double total = 0;
        for (Platillo p : platillos) {
            total += p.getPrecio();
        }
        return total;
    }

    public List<Platillo> getPlatillos() {
        return platillos;
    }
}
