public interface GestionMesas {

    Mesa obtenerMesaDisponible();

    default Mesa obtenerMesaPorNumero(int numero) {
        return null;
    }

    default boolean reservarMesa(int numero, Reserva reserva) {
        return false;
    }

    default void mostrarMesasDisponibles() {
        System.out.println("Mostrar mesas no implementado.");
    }
}
