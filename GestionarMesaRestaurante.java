import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionarMesaRestaurante implements GestionMesas {

    private final List<Mesa> mesas;
    private final Map<Integer, Reserva> reservas;

    public GestionarMesaRestaurante(int cantidad) {
        mesas = new ArrayList<>();
        reservas = new HashMap<>();
        for (int i = 1; i <= cantidad; i++) {
            mesas.add(new Mesa(i));
        }
    }

    @Override
    public Mesa obtenerMesaDisponible() {
        for (Mesa m : mesas) {
            if (m.isDisponible()) {
                m.setDisponible(false);
                return m;
            }
        }
        return null;
    }

    @Override
    public Mesa obtenerMesaPorNumero(int numero) {
        for (Mesa m : mesas) {
            if (m.getNumero() == numero) {
                return m;
            }
        }
        return null;
    }

    @Override
    public boolean reservarMesa(int numero, Reserva reserva) {
        Mesa mesa = obtenerMesaPorNumero(numero);
        if (mesa != null && mesa.isDisponible()) {
            mesa.reservar(reserva);
            reservas.put(numero, reserva);
            return true;
        }
        return false;
    }

    @Override
    public void mostrarMesasDisponibles() {
        for (Mesa m : mesas) {
            m.mostrarEstado();
        }
    }
}
