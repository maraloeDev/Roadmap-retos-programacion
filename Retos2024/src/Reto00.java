public class Reto00 {

    /*
     * EJERCICIO:
     * - Crea un comentario en el código y coloca la URL del sitio web oficial del
     *   lenguaje de programación que has seleccionado.
     * - Representa las diferentes sintaxis que existen de crear comentarios
     *   en el lenguaje (en una línea, varias...).
     * - Crea una variable (y una constante si el lenguaje lo soporta).
     * - Crea variables representando todos los tipos de datos primitivos
     *   del lenguaje (cadenas de texto, enteros, booleanos...).
     * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
     *
     * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
     * debemos comenzar por el principio.
     */

    public static void main(String[] args) {

        //- Representa las diferentes sintaxis que existen de crear comentarios
        //     *   en el lenguaje (en una línea, varias...).

        // Este es un comentario

        /* Este es un comentario
         *de varias
         *lineas
         *
         * https://www.java.com/es/
         */

        //- Crea una variable (y una constante si el lenguaje lo soporta).
        String variable = "Esto es una variable";
        final String CONSTANTE = "Esto es una constante que no puede cambiar";

       // CONSTANTE = "Hola";

        // - Crea variables representando todos los tipos de datos primitivos
        //     *   del lenguaje (cadenas de texto, enteros, booleanos...).
        String nombre;
        int edad;
        double edadenDecimal;
        float edadEnDecimalLargo;
        byte unByte;
        char unValor;
        boolean verdaderoFalso;

        // - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
        System.out.println("¡Hola, Java");


    }
}
