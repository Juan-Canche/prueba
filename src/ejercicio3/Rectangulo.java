package ejercicio3;

public class Rectangulo extends Figura {

    /**
     * Crea un rectanguloo
     *
     * @param base base del rectángulo debe ser mayor que cero
     * @param altura altura del rectángulo debe ser mayor que cero
     */
    public Rectangulo(double base, double altura) {
        // Hereda las propiedades de la clase abstracta
        super(base, altura);
    }

    /**
     * @return el area del rectangulo base por altura
     */
    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    /**
     * @return el nombre de la figura: rectángulo
     */
    @Override
    public String getNombre() {
        return "rectángulo";
    }
}