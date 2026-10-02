package ejercicio2;
import java.util.ArrayList;
import java.util.List;

/**
 * Operaciones para gestionar una lista de clientes
 */
public class GestorClientes {

    /**
     * Elimina de la lista un nombre indicado
     * La lista recibida se modifica
     *
     * @param clientes lista de nombres de clientes
     * @param nombreInactivo nombre del cliente a eliminar
     * @throws IllegalArgumentException si la lista es null lanza una excepcion
     */
    public static void eliminarClientesInactivos(List<String> clientes, String nombreInactivo) {
        if (clientes == null) {
            throw new IllegalArgumentException("La lista de clientes no puede ser null");
        }

        for (int indice = clientes.size() - 1; indice >= 0; indice--) {
            if (clientes.get(indice).equals(nombreInactivo)) {
                clientes.remove(indice);
            }
        }
    }

    /**
     * Punto de entrada del programa
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add("Pedro");

        eliminarClientesInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}