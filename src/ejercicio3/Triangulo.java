package ejercicio3;

/**
 * Triagulo definido por su base y su altura.
 */
public class Triangulo extends Figura {

    /** Divisor usado en la formula del area del triangulo */
    private static final double DIVISOR_AREA = 2;

    /**
     * Crea un triangulo
     *
     * @param base base del triángulo debe ser mayor que cero
     * @param altura altura del triángulo deber ser mayor que cero
     */
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     * @return el area del triangulo base por altura entre dos
     */
    @Override
    public double calcularArea() {
        return (getBase() * getAltura()) / DIVISOR_AREA;
    }

    /**
     * @return el nombre de la figura: triangulo
     */
    @Override
    public String getNombre() {
        return "triángulo";
    }
}