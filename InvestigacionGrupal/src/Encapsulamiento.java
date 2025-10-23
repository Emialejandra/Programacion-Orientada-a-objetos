public class Encapsulamiento {
        private String nombre; // atributo privado
        private int edad;

        // Metodo público para asignar valores
        public void setDatos(String n, int e) {
            nombre = n;
            edad = e;
        }

        // Metodo público para mostrar valores
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }
    }

