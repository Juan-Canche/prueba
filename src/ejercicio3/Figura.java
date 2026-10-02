package ejercicio3;
/*
 * Figura geometrica con base y altura que sirve como modelo
 **/
public abstract class Figura {

    private final double base;
    private final double altura;

    /**
     * Crea una figura con la base y altura proporcionadas
     *
     * @param base base de la figura debe ser mayor que cero
     * @param altura altura de la figura debe ser mayor que cero
     * @throws IllegalArgumentException si la base o la altura no son positivas lanza una excepcion
     */
    protected Figura(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser mayores que cero");
        }
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return la base de la figura
     */
    public double getBase() {
        return base;
    }

    /**
     * @return la altura de la figura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * calcula el area de la figura.
     *
     * @return el área de la figura
     */
    public abstract double calcularArea();

    /**
     * indica el nombre de la figura.
     *
     * @return el nombre de la figura (por ejemplo, "triángulo")
     */
    public abstract String getNombre();
}