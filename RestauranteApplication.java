} else if (opcionMesa == 3) {
    anfitrion.mostrarMesasDisponibles(gestionMesas);

    System.out.print("Número de mesa a reservar: ");
    int num = sc.nextInt();

    System.out.print("Nombre del cliente: ");
    sc.nextLine();
    String nombre = sc.nextLine();

    System.out.print("Contacto del cliente: ");
    String contacto = sc.nextLine();

    System.out.print("Fecha (YYYY-MM-DD): ");
    LocalDate fecha = LocalDate.parse(sc.next());

    System.out.print("Hora (HH:MM en formato 24h, ej 18:30): ");
    LocalTime hora = LocalTime.parse(sc.next());

    try {
        LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

        Persona cliente = new Persona(nombre, contacto);
        Reserva reserva = new Reserva(cliente, fechaHora);

        boolean reservada = ((GestionarMesaRestaurante) gestionMesas).reservarMesa(num, reserva);

        if (reservada) {
            System.out.println("Mesa reservada exitosamente.");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Contacto: " + cliente.getContacto());
            System.out.println("Fecha y hora: " + reserva.getFechaHoraAMPM());
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }

    } catch (Exception e) {
        System.out.println("Error en la reserva: " + e.getMessage());
    }
    return;
}
