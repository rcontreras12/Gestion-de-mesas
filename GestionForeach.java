public class GestionForeach {
   public static void main(String[] args) {
    // gestionar mesas
    //true = disponible false = ocupada
    boolean[] estadomesa = {true, false, true, true, false, false, true, true};

    System.out.println("Inicio del proceso de verificacion");

    int contadorLibres = 0;
    int numeromesas = 1; // contador de mesas

    // Estrucura del for-each
    for (boolean mesadisponible : estadomesa) {
        
        // Esta disponible?
        if (mesadisponible) {
            System.out.println("[mesa" + numeromesas +"] -> Estado: D (disponible).");
            contadorLibres++; // para avanzar al siguiente numero de mesas
        } else {
            // ocupada
            System.out.println("[mesa" + numeromesas +"] -> Estado: ND (ocuapdo).");
        }
        numeromesas++;
    }

    System.out.println("Reporte de mesas, hay" + contadorLibres + "mesas listas para su uso");
   }
}
