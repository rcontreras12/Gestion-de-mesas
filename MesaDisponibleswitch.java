// verificacion del estado de una mesa mediante switch
public class MesaDisponibleswitch {
    public static void main(String[] args) {
        // Las variables van a representar el estado de la mesa
        // 0 = la mesa esta disponible, 1 = la mesa esta ocupada, 2 = estado no registrado en el sistema
        int estadomesa = 0;

        switch (estadomesa) {
            case 0:
                System.out.println("la mesa esta disponible para su uso");
                break;

            case 1:
                System.out.println("actualmente la mesa esta ocupada");
                break;

            case 2:
                System.out.println("El estado de la mesa no ha sido registrado, por favor asegurese de agregar el estado lo mas pronto posible");
                break;
        
            default:
                System.out.println("valor invalido insertado, por favor verifique los datos ingresados");
                break;
        }

        
    }
}