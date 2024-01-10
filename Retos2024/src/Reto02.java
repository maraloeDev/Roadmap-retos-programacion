public class Reto02 {

    /*
     * EJERCICIO:
     * - Crea ejemplos de funciones básicas que representen las diferentes
     *   posibilidades del lenguaje:
     *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
     * - Comprueba si puedes crear funciones dentro de funciones.
     * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
     * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
     * - Debes hacer print por consola del resultado de todos los ejemplos.
     *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
     */

    public static void main(String[] args) {

        funcionSinParametros();
        funcionConParametros(1,2);
        funcionConRetorno(1,2,true);

        int numero1 = 1;
        int numero2 = 2;

        System.out.println("Esta es la funcion con retorno" + numero1 +" " + numero2);
    }

    public int numeros;
    private boolean VF;

    public static void funcionSinParametros() {

//        public void funcionSinParametros(int n1){
//
//
//        }

        System.out.println("Esta es la funcion sin parametros");
    }

    public static void funcionConParametros(int numero1, int numero2) {

        System.out.println("Esta es la funcion con parametros " + numero1 + " " + numero2);
    }

    public static boolean funcionConRetorno(int numero1, int numero2, boolean VF) {
        System.out.println("Esta es la funcion con retorno " + numero1 + " " + numero2);
        return VF;
    }
}
