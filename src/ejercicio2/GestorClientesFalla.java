package ejercicio2;
import java.util.ArrayList;
import java.util.List;

// ERROR: la clase no tiene javadoc
public class GestorClientesFalla {
// ERROR: el metodo no tiene javadoc
// ERROR: el nombre eliminarInactivos no es claro, solo recibe un nombre y inactivo no dice que es
// ERROR: no revisa si clientes o inactivo son null
    public static void eliminarInactivos(List<String> clientes, String inactivo) {
// ERROR: borra de la lista mientras la recorre con for-each, puede dar ConcurrentModificationException
//        o saltarse elementos
        for (String cliente : clientes) {
// ERROR: == compara referencias y no el texto, hay que usar equals
            if (cliente == inactivo) {
                clientes.remove(cliente);
            }
        }
    }

// ERROR: el main no tiene javadoc
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
// ERROR: new String crea un objeto que no hace falta
        clientes.add(new String("Pedro"));
        eliminarInactivos(clientes, "Pedro");
// ERROR: solo imprime, no comprueba el resultado y no prueba null
        System.out.println(clientes);
    }
}