package Reto03;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

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
                    System.out.println("Introduce nombre de contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    buscarContacto(nombreBuscar);
                    break;
                case 2:
                    System.out.print("Introduce nombre del contacto: ");
                    String anadirNombre=scanner.nextLine();

                    System.out.println("Introduce un telefono del contacto: ");
                    int anadirTelefono=scanner.nextInt();

                    Contactos nuevoContacto = new Contactos(anadirNombre,anadirTelefono);

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

    public static void anadirContacto(Contactos c){

        for (Contactos anadirContactos : listaContactos){

            if (anadirContactos.getNombre().equalsIgnoreCase(c.getNombre()))

        }

    }
}