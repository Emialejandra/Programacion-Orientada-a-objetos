public class main {
        public static void main(String[] args) {

            Encapsulamiento p = new Encapsulamiento();
            p.setDatos("Emilia", 20);
            p.mostrarDatos();

            // Llamada al método estático (sin crear objeto)
            System.out.println("Cuadrado: " + EjemploStatic.cuadrado(4));

            // Llamada al método de instancia (con objeto)
            EjemploStatic obj = new EjemploStatic();
            System.out.println("Triple: " + obj.triple(4));
        }
    }

