class Ingredientes {
    private boolean disponibles;

    public Ingredientes(boolean disponibles) {
        this.disponibles = disponibles;
    }

    public boolean estanDisponibles() {
        return disponibles;
    }
}

class Platillo {
    private boolean cocinado = false;
    private boolean aprobado = false;

    public void cocinar() {
        cocinado = true;
    }

    public boolean estaCocinado() {
        return cocinado;
    }

    public void aprobar() {
        aprobado = true;
    }

    public boolean estaAprobado() {
        return aprobado;
    }
}

class Cocina {

    public boolean prepararPlatillo(Ingredientes ingredientes) {

        if (!ingredientes.estanDisponibles()) {
            System.out.println("Ingredientes no disponibles. Respuesta Negativa.");
            return false;
        }

        System.out.println("Ingredientes disponibles. Iniciando cocción.");

        Platillo platillo = new Platillo();

        boolean listo = false;

        while (!listo) {
            System.out.println("Cocinando...");
            platillo.cocinar();
            listo = platillo.estaCocinado();
        }

        System.out.println("Platillo listo. Comprobando...");

        if (!platillo.estaAprobado()) {
            System.out.println("Comprobado. Respuesta Positiva.");
            return true;
        }

        System.out.println("Platillo aprobado. Platillo Preparado.");
        return false;
    }
}

public class ProcesoCocina {

    public static void main(String[] args) {

        Ingredientes ingredientes = new Ingredientes(true);

        Cocina cocina = new Cocina();

        boolean resultado = cocina.prepararPlatillo(ingredientes);

        if (resultado) {
            System.out.println("Entregar platillo al anfitrión.");
        } else {
            System.out.println("No se pudo preparar el platillo.");
        }
    }
}

