import java.util.Scanner;

public class GestionMesas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos número de mesas
        System.out.print("Ingrese la cantidad de mesas: ");
        int n = sc.nextInt();

        // 0 = Ocupada, 1 = Libre, 2 = Preparada
        int[] mesas = new int[n];

        // Leer estado inicial de cada mesa
        System.out.println("Ingrese el estado de cada mesa (0 Ocupada, 1 Libre):");
        for (int i = 0; i < n; i++) {
            System.out.print("Mesa " + (i + 1) + ": ");
            int estado = sc.nextInt();
            if (estado != 0 && estado != 1) {
                System.out.println("Valor inválido, se asume Ocupada (0).");
                estado = 0;
            }
            mesas[i] = estado;
        }

        // Mostrar estados iniciales
        System.out.println("\nEstados iniciales:");
        imprimirMesas(mesas);

        // Verificar y preparar mesas libres usando for
        int preparadas = verificarYPrepararMesas(mesas);

        // Mostrar estados finales y resumen
        System.out.println("\nEstados finales:");
        imprimirMesas(mesas);
        System.out.println("\nMesas preparadas en esta ejecución: " + preparadas);

        sc.close();
    }

    // Recorre las mesas con for y prepara las libres
    public static int verificarYPrepararMesas(int[] mesas) {
        int contadorPreparadas = 0;
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 1) {           // si está libre
                mesas[i] = 2;              // marcar como preparada
                contadorPreparadas++;
                System.out.println("Mesa " + (i + 1) + " preparada.");
            } else {
                System.out.println("Mesa " + (i + 1) + " no disponible para preparar.");
            }
        }
        return contadorPreparadas;
    }

    // Método auxiliar para imprimir el estado de las mesas
    public static void imprimirMesas(int[] mesas) {
        for (int i = 0; i < mesas.length; i++) {
            String estado;
            if (mesas[i] == 0) estado = "Ocupada";
            else if (mesas[i] == 1) estado = "Libre";
            else if (mesas[i] == 2) estado = "Preparada";
            else estado = "Desconocido";
            System.out.println("Mesa " + (i + 1) + ": " + estado);
        }
    }
}