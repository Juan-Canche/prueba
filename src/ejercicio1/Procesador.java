package ejercicio1;
// ERROR: la clase no tiene javadoc
// ERROR: el nombre Procesador no dice que procesa
public class Procesador {
// ERROR: el metodo no tiene javadoc
// ERROR: el nombre procesar no dice que hace, y no devuelve la suma, solo la imprime
// ERROR: el parametro datos no dice nada
    public static void procesar(int[] datos) {
// ERROR: la variable i no dice nada.
        int i = 0;
// ERROR: el nombre suma es muy general y un int se puede desbordar, mejor long
        int suma = 0;
// ERROR: no revisa si datos es null.
// ERROR: es mejor un for que un while con contador a mano
        while (i < datos.length) {
// ERROR: suma el valor antes de revisar si es negativo, entonces si suma los negativos
            suma += datos[i];
            if (datos[i] < 0) {
// ERROR: el mensaje esta escrito directo, deberia ser una constante
                System.out.println("Valor negativo encontrado, se omite");
// ERROR: el continue se salta el i++, entonces el ciclo nunca termina
                continue;
            }
            i++;
        }
// ERROR: imprime el resultado en vez de devolverlo, mezcla calculo con impresion
        System.out.println("Suma total: " + suma);
    }

// ERROR: el main no tiene javadoc
    public static void main(String[] args) {
// ERROR: el nombre datos no dice nada y no prueba casos como vacio o null
        int[] datos = {5, 10, -3, 8};
// ERROR: no comprueba que el resultado sea el esperado
        procesar(datos);
    }
}
