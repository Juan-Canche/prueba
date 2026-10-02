package ejercicio3;

public class ProcesadorFiguras {

    /**
     * imprime en consola el area de una figura
     *
     * @param figura figura a procesar
     * @throws IllegalArgumentException si la figura es null
     */
    public void imprimirArea(Figura figura) {
        if (figura == null) {
            throw new IllegalArgumentException("La figura no puede ser null");
        }
        System.out.println("Área del " + figura.getNombre() + ": " + figura.calcularArea());
    }

    /**
     * Punto de entrada del programa
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        ProcesadorFiguras procesador = new ProcesadorFiguras();
        Figura rectangulo = new Rectangulo(4, 5);
        Figura triangulo = new Triangulo(4, 5);

        procesador.imprimirArea(rectangulo);
        procesador.imprimirArea(triangulo);
    }
}