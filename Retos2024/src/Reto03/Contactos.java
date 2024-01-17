package Reto03;

public class Contactos {

    /*
     * EJERCICIO:
     * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto en tu lenguaje.
     * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
     *
     * DIFICULTAD EXTRA (opcional):
     * Crea una agenda de contactos por terminal.
     * - Debes implementar funcionalidades de búsqueda, inserción, actualización
     *   y eliminación de contactos.
     * - Cada contacto debe tener un nombre y un número de teléfono.
     * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
     *   y a continuación los datos necesarios para llevarla a cabo.
     * - El programa no puede dejar introducir números de teléfono no númericos y con más
     *   de 11 dígitos (o el número de dígitos que quieras).
     * - También se debe proponer una operación de finalización del programa.
     */

        private String nombre;
        private int numeroTelefono;

        public Contactos(String nombre, int numeroTelefono) {
            this.nombre = nombre;
            this.numeroTelefono = numeroTelefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNumeroTelefono() {
            return numeroTelefono;
        }

        public void setNumeroTelefono(int numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
        }

        @Override
        public String toString() {
            return "Contactos{" +
                    "nombre='" + nombre + '\'' +
                    ", numeroTelefono=" + numeroTelefono +
                    '}';
        }
    }