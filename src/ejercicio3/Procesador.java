package ejercicio3;
// ERROR: hay tres clases public en un solo archivo, Java solo deja una
// ERROR: la clase no tiene javadoc
// ERROR: Figura en realidad es un rectangulo y deberia ser abstracta
public class Figura {
// ERROR: los atributos son public, cualquiera les puede poner valores malos negativos o cero
// ERROR: no hay constructor, el objeto se crea con 0 y 0
    public double base;
    public double altura;

// ERROR: el metodo no tiene javadoc
    public double calcularArea() {
        return base * altura;
    }
}

// ERROR: la clase no tiene javadoc
// ERROR: un triangulo no es un tipo de rectangulo, la herencia esta mal
public class Triangulo extends Figura {
// ERROR: no tiene javadoc ni @Override
    public double calcularArea() {
// ERROR: el 2 esta escrito directo, deberia ser una constante
        return (base * altura) / 2;
    }
}

// ERROR: la clase no tiene javadoc
// ERROR: el nombre Procesador es muy general
public class Procesador {
// ERROR: el metodo no tiene javadoc
// ERROR: no revisa si figura es null
// ERROR: usa instanceof y cast para saber que imprimir, el polimorfismo ya lo hace
//        y cada figura nueva necesita otro if
    public void imprimirArea(Figura figura) {
        if (figura instanceof Triangulo) {
// ERROR: la variable t no dice nada y el cast no hace falta
            Triangulo t = (Triangulo) figura;
            System.out.println("Área del triángulo: " + t.calcularArea());
        } else {
// ERROR: el mensaje cambia segun el tipo
            System.out.println("Área: " + figura.calcularArea());
        }
    }

// ERROR: el main no tiene javadoc
    public static void main(String[] args) {
// ERROR: la variable p no dice nada
        Procesador p = new Procesador();
        Figura rectangulo = new Figura();
// ERROR: asigna los atributos uno por uno, sin validar nada
        rectangulo.base = 4;
        rectangulo.altura = 5;

        Triangulo triangulo = new Triangulo();
        triangulo.base = 4;
        triangulo.altura = 5;

// ERROR: solo imprime, no comprueba el resultado y no prueba valores malos
        p.imprimirArea(rectangulo);
        p.imprimirArea(triangulo);
    }
}