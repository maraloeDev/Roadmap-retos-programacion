import java.util.ArrayList;
import java.util.Scanner;

public class Reto03 {

    class Agenda {

        static ArrayList<Contactos> listaContactos = new ArrayList<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int opcion;
            do {

                System.out.println("Cual es la primera operación que quieres realizar: " +
                        "\n" +
                        "1. Búsqueda de contacto," +
                        "\n" +
                        "2. Inserción de contacto" +
                        "\n" +
                        "3.  Actualización de contacto" +
                        "\n" +
                        "4.  Eliminación de contactos." +
                        "\n" +
                        "5. Salir");

                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        if (listaContactos.isEmpty()) {
                            System.out.println("Antes, crea un contacto");
                        }
                        System.out.println("Introduce nombre de contacto a buscar: ");
                        String nombreBuscar = scanner.nextLine();
                        buscarContacto(nombreBuscar);
                        break;
                    case 2:
                        System.out.print("Introduce nombre del contacto: ");
                        String anadirNombre = scanner.nextLine();

                        System.out.println("Introduce un telefono del contacto: ");
                        int anadirTelefono = scanner.nextInt();

                        Contactos nuevoContacto = new Contactos(anadirNombre, anadirTelefono);
                        anadirContacto(nuevoContacto);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion no contemplada");
                }

            } while (opcion != 5);
        }

        public static void buscarContacto(String nombre) {

            for (Contactos busquedaContacto : listaContactos) {
                if (busquedaContacto.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Contacto encontrado: " + busquedaContacto.getNombre());
                    break;
                } else {
                    System.out.println("Contacto no creado");
                    break;
                }
            }

        }

        public static void anadirContacto(Contactos c) {

            for (Contactos anadirContactos : listaContactos) {

                if (!anadirContactos.getNombre().equalsIgnoreCase(c.getNombre())) {
                    System.out.println("Contacto creado correctamente");
                    listaContactos.add(c);
                    break;
                } else if (anadirContactos.getNombre() == null) {
                    System.out.println("Contacto no creado");
                    break;
                } else if (anadirContactos.getNumeroTelefono() <= 0) {
                    System.out.println("Contacto no creado");
                    break;

                }

            }

        }
    }
}
class Contactos{

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