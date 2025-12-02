public class GestionFuncion {
    public static void verificarDisponibilidad(boolean[] estadomesa) {
        System.err.println("verificar disponibilidad de las mesas");
        int contadorLibres =0;
        int numeromesas = 1;
        for (boolean mesadisponible : estadomesa) {
            if (mesadisponible) {
                System.out.println("[mesa" + numeromesas + "] -> Disponible");
                contadorLibres++;
            } else {
                System.out.println("[mesa" + numeromesas +"] ocupado");
            }
            numeromesas++;
        }
        System.out.println("reporte de mesas, hay" + contadorLibres +" mesas disponibles");

    }
    public static void main(String[] args) {
        boolean[] estadomesa = {true, false, true,true,false,false,false,true};
        verificarDisponibilidad(estadomesa); // esta linea es para llamar a la funcion
    }
}
