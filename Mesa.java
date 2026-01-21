public class Mesa {

    private int numero;
    private boolean disponible;
    private Reserva reserva;

    public Mesa(int numero) {
        this.numero = numero;
        this.disponible = true;
        this.reserva = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible && reserva == null;
    }

    public boolean estaReservada() {
        return reserva != null;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        if (disponible) {
            this.reserva = null;
        }
    }

    public void reservar(Reserva reserva) {
        this.reserva = reserva;
        this.disponible = false;
    }

    public void cancelarReserva() {
        this.reserva = null;
        this.disponible = true;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void mostrarEstado() {
        if (estaReservada()) {
            System.out.println("Mesa " + numero + " está RESERVADA");
        } else if (disponible) {
            System.out.println("Mesa " + numero + " está DISPONIBLE");
        } else {
            System.out.println("Mesa " + numero + " está OCUPADA");
        }
    }
}
