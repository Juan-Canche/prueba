package ejercicio1;

/**
 * Operaciones de suma sobre un arregloo de numeros enteros
 */
public class SumadorNumeros {

    /** Mensaje para mostrar cuando se encuentra un valor en negativo*/
    private static final String MENSAJE_VALOR_NEGATIVO = "Valor negativo encontrado, se omite";

    /**
     * Suma los numeros enteros positivos y opmite los negativos
     *
     * @param listaNumeros arreglo de enteros a sumar puede ser null
     * @return la suma de los valores mayores o iguales a cero; 0 si el arreglo es null o esta vacío
     */
    public static long sumarNumerosEnteros(int[] listaNumeros) {
        long sumaNumeros = 0;

        if (listaNumeros == null) {
            return 0;
        }

        for (int contadorSuma = 0; contadorSuma < listaNumeros.length; contadorSuma++) {
            if (listaNumeros[contadorSuma] >= 0) {
                sumaNumeros += listaNumeros[contadorSuma];
            } else {
                System.out.println(MENSAJE_VALOR_NEGATIVO);
            }
        }

        return sumaNumeros;
    }

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        int[] listadoNumeros = {5, 10, -3, 8};
        int[] numeros = null;

        System.out.println("Suma total: " + sumarNumerosEnteros(listadoNumeros));
        System.out.println("Suma total: " + sumarNumerosEnteros(numeros));
    }
}
