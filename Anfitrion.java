public class Anfitrion extends Persona {

    public Anfitrion(String nombre) {
        super(nombre, "");
    }

    public void mostrarMesasDisponibles(GestionMesas gestion) {
        gestion.mostrarMesasDisponibles();
    }

    public Mesa asignarMesa(GestionMesas gestion) {
        return gestion.obtenerMesaDisponible();
    }

    public void liberarMesa(Mesa mesa) {
        mesa.setDisponible(true);
    }
}