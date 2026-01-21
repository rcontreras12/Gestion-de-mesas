import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private Persona cliente;
    private LocalDateTime fechaHora;

    public Reserva(Persona cliente, LocalDateTime fechaHora) {

        if (fechaHora.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("No se puede reservar en una fecha u hora pasada.");
        }

        this.cliente = cliente;
        this.fechaHora = fechaHora;
    }

    public Persona getCliente() {
        return cliente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getFechaHoraAMPM() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        return fechaHora.format(formatter);
    }

    @Override
    public String toString() {
        return "Reserva para " + cliente.getNombre() + " el " + getFechaHoraAMPM();
    }
}
