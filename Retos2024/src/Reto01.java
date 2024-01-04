public class Reto01 {

    /*
     * EJERCICIO:
     * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
     *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
     *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
     * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
     *   que representen todos los tipos de estructuras de control que existan
     *   en tu lenguaje:
     *   Condicionales, iterativas, excepciones...
     * - Debes hacer print por consola del resultado de todos los ejemplos.
     *
     * */
    public static void main(String[] args) {
        String nombre = "Eduardo";
        int edad = 24;
        double aniosEnLaProgramacion = 2.5;
        char sexo = 'M';

        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " y llevo aqui " + aniosEnLaProgramacion + " y soy de genero " + sexo);

        System.out.println("-------------");
        System.out.print("Voy a recorrer un bucle con 10 numeros mediante un bucle for");

        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);

        }
        System.out.println();

        System.out.print("Con un bucle while");

        int i = 0;

        while (10 >= i) {
            System.out.print(" " + i);
            i++;
        }

        System.out.println();
        System.out.print("Con un bucle do-while");

        int contador = 0;
        do {

            System.out.print(" " + contador);
            contador++;

        } while (contador <= 10);

        /*
         * DIFICULTAD EXTRA (opcional):
         * Crea un programa que imprima por consola todos los números comprendidos
         * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
         *
         * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
         * LAURA ORTEGA - 02/01/2024
         */

        System.out.println();
        System.out.println("DIFICULTAD EXTRA");
        for (int j = 10; j <= 55; j++) {

            if ((j % 2) == 0) {

                if (j == 16) {
                    continue;
                }
                System.out.println("Soy el numero par " + j);
            }
        }
    }
}