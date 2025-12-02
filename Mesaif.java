// Verificar el estado de una mesa en el sistema mediante los comandos if, else y else if
public class Mesaif {
    public static void main(String[] args) {
        // La variable va a representar el estado actual de la mesa
        // el valor 0= disponible. El valor 1= la mesa esta ocupada. 2 = Estado de la mesa desconocido
       int estadomesa = 0;
        
        if (estadomesa ==0) {
            System.out.println("La mesa esta disponible para su uso");
        } else if (estadomesa ==1) {
            System.out.println("La mesa esta siendo ocupada en estos momentos");
        } else if (estadomesa ==2) {
            System.out.println("estado de la mesa desconocido, por favor informar al personal para verificar su estado lo mas breve posible");
        } else {
            System.out.println("valor ingresado invalido, por favor verifique el sistema y siga las instrucciones colocadas al inicio");
        }
    }
}
