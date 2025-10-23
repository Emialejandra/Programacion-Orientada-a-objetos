public class MetodosyFunciones {
    //estructura basica
   /* public static void saludar(){
        System.out.println("¡Investigacion grupal!");
    }*/

    //bloque de codigo
    //{int x=5;System.out.println(x);}

        // Metodo funcion dentro de una clase
    /*public int sumar(int a, int b) {
            return a + b;
        }*/

        //estructura de un metodo
    /*[modificadorAcceso][static][tipoDeRetorno]nombreMetodo([parametros]){
            [return valor;]
     }*/
//ejemplos de funciones
    public static int sumar(int num1, int num2) {
        int resultado = num1 + num2;  // cuerpo del metodo
        return resultado;              // devuelve el valor
    }
    public static void saludar(){
        System.out.println("¡Investigacion grupal!");}

    public static double calcularArea(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) {
        //ejercicio1
        System.out.println("EJERCICIO 1");
            MetodosyFunciones calc = new MetodosyFunciones();
            int total = calc.sumar(5, 3);
            System.out.println("La suma es: " + total);
            //ejercicio2
        System.out.println("EJERCICIO 2");
             saludar();
        //ejercicio 3
        System.out.println("EJERCICIO 3");
        double resultado = calcularArea(10.0, 5.0);
        System.out.println("El área del triángulo es: " + resultado);
    }
}

