import java.util.Scanner;

public class Reto04 {

    /*
     * EJERCICIO:
     * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
     * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
     * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
     *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
     *   interpolación, verificación...
     *
     * DIFICULTAD EXTRA (opcional):
     * Crea un programa que analice dos palabras diferentes y realice comprobaciones
     * para descubrir si son:
     * - Palíndromos
     * - Anagramas
     * - Isogramas
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String variable ="Hola que tal estas";
        String variable2 ="Hola que tal estas1";
        String variable3 ="Hola que tal estas";
        System.out.println("Acceder a caracteres: " + variable.indexOf("H"));
        System.out.println("Subcadenas: " + variable.substring(0,15));
        System.out.println("La longitud de la cadena es " + variable.length());
        System.out.println("La concatenación es de " + variable.concat(" Adios"));
        System.out.println("Recorrer con un bucle for ");

        for (int i = 0; i < variable.length(); i++) {
            System.out.println(variable.charAt(i));
        }

        System.out.println("conversión a mayúsculas y minúsculas: " + variable.toLowerCase());
        System.out.println("conversión a mayúsculas y minúsculas: " + variable.toUpperCase());

        System.out.println("Reemplazo: " + variable.replace("a","e"));
        System.out.println("${Ojala se puediera hacer la interpolación de cadenas en Java}");
        System.out.println("Verificación 1 " + variable.compareToIgnoreCase(variable2));
        System.out.println("Verificación 2 " + variable.compareToIgnoreCase(variable3));
    }
}
