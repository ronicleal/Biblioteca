/**
 * @author Ronic Diego
 */

import java.util.Scanner;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Libro[] libros = new Libro[100]; 
        Usuario[] usuarios = new Usuario[100]; 

        int cantidadLibros = 0; 
        int cantidadUsuarios = 0; 

        
        cantidadLibros = Libro.agregarLibro(libros , cantidadLibros, new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Ficción"));
        cantidadLibros = Libro.agregarLibro(libros, cantidadLibros, new Libro("Harry Potter y la camara secreta", "J.K. Rowling", "Ficción"));
        cantidadLibros = Libro.agregarLibro(libros, cantidadLibros, new Libro("Harry Potter y el caliz de fuego", "J.K. Rowling", "Ficción"));
        cantidadLibros = Libro.agregarLibro(libros, cantidadLibros, new Libro("Harry Potter y el prisionero de Azkaban", "J.K. Rowling", "Ficción"));
        cantidadLibros = Libro.agregarLibro(libros, cantidadLibros, new Libro("Harry Potter y las reliquias de la muerte", "J.K. Rowling", "Ficción"));

        
        cantidadUsuarios = Usuario.registrarUsuario(usuarios, cantidadUsuarios, new Usuario("Jorge", "1234", "admin"));
        cantidadUsuarios = Usuario.registrarUsuario(usuarios, cantidadUsuarios, new Usuario("Ronic", "1234", "user"));
        cantidadUsuarios = Usuario.registrarUsuario(usuarios, cantidadUsuarios, new Usuario("Diego", "1234", "user"));
        cantidadUsuarios = Usuario.registrarUsuario(usuarios, cantidadUsuarios, new Usuario("Gloria", "1234", "user"));
        cantidadUsuarios = Usuario.registrarUsuario(usuarios, cantidadUsuarios, new Usuario("Lucia", "1234", "user"));

        Scanner sc = new Scanner(System.in);

        
        System.out.println("LOGIN");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        Usuario usuarioActual = null;

        for (int i = 0; i < cantidadUsuarios; i++) {
            if (usuarios[i].getNombre().equals(nombre) && usuarios[i].getContrasena().equals(contrasena)) {
                usuarioActual = usuarios[i];
                break;
            }
        }

        if (usuarioActual == null) {
            System.out.println("No valen estos datos");
            return;
        }

        
        while (true) {
            System.out.println("--- Menú ---");
            if ("admin".equals(usuarioActual.getRol())) {
                System.out.println("1. Agregar Libro");
                System.out.println("2. Eliminar Libro");
                System.out.println("3. Consultar Usuarios");
                System.out.println("4. Mostrar Libros");
                System.out.println("5. Salir");

                int opcion = sc.nextInt();
                sc.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Título del libro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor del libro: ");
                        String autor = sc.nextLine();
                        System.out.print("Categoría del libro: ");
                        String categoria = sc.nextLine();
                        cantidadLibros = Libro.agregarLibro(libros, cantidadLibros, new Libro(titulo, autor, categoria));
                        break;

                    case 2:
                        System.out.print("Libro que quieres eliminar: ");
                        titulo = sc.nextLine();
                        cantidadLibros = Libro.eliminarLibro(libros, cantidadLibros, titulo);
                        break;

                    case 3:
                        Usuario.consultarUsuarios(usuarios, cantidadUsuarios);
                        break;

                    case 4:
                        Libro.mostrarLibros(libros, cantidadLibros);
                        break;

                    case 5:
                        return;

                    default:
                        System.out.println("Opción inválida.");
                }
            } else { 
                System.out.println("1. Buscar Libro");
                System.out.println("2. Prestar Libro");
                System.out.println("3. Devolver Libro");
                System.out.println("4. Mostrar Libros Disponibles");
                System.out.println("5. Salir");

                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Que buscas: ");
                        String criterio = sc.nextLine();
                        Libro.eliminarLibro(libros, cantidadLibros, criterio);
                        break;

                    case 2:
                        System.out.print("Libro que se va a prestar: ");
                        String titulo = sc.nextLine();
                        for (int i = 0; i < cantidadLibros; i++) {
                            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                                usuarioActual.prestarLibro(libros[i]);
                                break;
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Libro que se va a devolver: ");
                        titulo = sc.nextLine();
                        for (Libro libro : usuarioActual.getLibrosPrestados()) {
                            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                                usuarioActual.devolverLibro(libro);
                                break;
                            }
                        }
                        break;

                    case 4:
                        Libro.mostrarLibros(libros, cantidadLibros);
                        break;

                    case 5:
                        return;

                    default:
                        System.out.println("Opción no valida.");
                }
            }
        }
    }
}