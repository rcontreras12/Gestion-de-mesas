public class GestionDoWhile {
    public static void main(String[] args) {
        // simulacion de entradas y variables

        int mesaAsignada = 15;
        String pedidoRecibido = "hamburguesa";

        boolean validacionExitosa = false;
        boolean datosCoinciden = true; //

        System.out.println("Iniciar validacion");

        // estructura general del do while
        do {
            System.out.println("\n ----empezar vinculacion mesa-pedido");

        if (datosCoinciden) {
            validacionExitosa = true;
            System.out.println("validacion exitosa, mesa" + mesaAsignada + "lista");
        } else {
            System.out.println("error, mesa y pedido no coinciden, intentelo de nuevo verificando los datos");

                // En un sistema real, aquí iría código para reintentar la validación o pedir nuevos datos.
                // Para evitar un bucle infinito en este ejemplo, podemos forzar la salida:
                datosCoinciden = true;
        }


        } while(!validacionExitosa);
        System.out.println("\n---- proceso de validacion terminado");
        System.out.println("proceder a entregar cuenta en la mesa");
        
           
    }
}
