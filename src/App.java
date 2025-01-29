    import java.util.ArrayList;
    import java.util.Scanner;
    
   
    
        public static void main(String[] args) {
            ArrayList<Libro> libros = new ArrayList<>();
            ArrayList<Usuario> usuarios = new ArrayList<>();
    
            // Datos de prueba
            Libro.agregarLibro(libros, new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Ficción"));
            Libro.agregarLibro(libros, new Libro("Harry Potter y la camara secreta", "J.K. Rowling", "Ficción"));
            Libro.agregarLibro(libros, new Libro("Harry Potter y el caliz de fuego", "J.K. Rowling", "Ficción"));
            Libro.agregarLibro(libros, new Libro("Harry Potter y el prisionero de Azkaban", "J.K. Rowling", "Ficción"));
            Libro.agregarLibro(libros, new Libro("Harry Potter y las reliquias de la muerte", "J.K. Rowling", "Ficción"));
           
            Usuario.registrarUsuario(usuarios, new Usuario("Jorge", "1234", "admin"));
            Usuario.registrarUsuario(usuarios, new Usuario("Ronic", "1234", "user"));
            Usuario.registrarUsuario(usuarios, new Usuario("Diego", "1234", "user"));
            Usuario.registrarUsuario(usuarios, new Usuario("Gloria", "1234", "user"));
            Usuario.registrarUsuario(usuarios, new Usuario("Lucia", "1234", "user"));
    
            Scanner sc = new Scanner(System.in);
    
            // Login
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Contraseña: ");
            String contrasena = sc.nextLine();
    
            Usuario usuarioActual = null;
    
            for (Usuario usuario : usuarios) {
                if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                    usuarioActual = usuario;
                    break;
                }
            }
    
            if (usuarioActual == null) {
                System.out.println("Credenciales incorrectas.");
                return;
            }
    
            // Menú interactivo
            while (true) {
                System.out.println("--- Menú ---");
                if ("admin".equals(usuarioActual.getRol())) {
                    System.out.println("1. Agregar Libro");
                    System.out.println("2. Eliminar Libro");
                    System.out.println("3. Consultar Usuarios");
                    System.out.println("4. Mostrar Libros");
                    System.out.println("5. Salir");
                    
                    int opcion = sc.nextInt();
                    sc.nextLine(); // Consumir newline
                    
                    switch (opcion) {
                        case 1:
                            System.out.print("Título del libro: ");
                            String titulo = sc.nextLine();
                            System.out.print("Autor del libro: ");
                            String autor = sc.nextLine();
                            System.out.print("Categoría del libro: ");
                            String categoria = sc.nextLine();
                            Libro.agregarLibro(libros, new Libro(titulo, autor, categoria));
                            break;
    
                        case 2:
                            System.out.print("Libro que quieres eliminar: ");
                            titulo = sc.nextLine();
                            Libro.eliminarLibro(libros, titulo);
                            break;
    
                        case 3:
                            Usuario.consultarUsuarios(usuarios);
                            break;
    
                        case 4:
                            Libro.mostrarLibros(libros);
                            break;
    
                        case 5:
                            return;
    
                        default:
                            System.out.println("Opción inválida.");
                    }
                } else { // Menú para usuarios normales
                    System.out.println("1. Buscar Libro");
                    System.out.println("2. Prestar Libro");
                    System.out.println("3. Devolver Libro");
                    System.out.println("4. Mostrar Libros Disponibles");
                    System.out.println("5. Salir");
    
                    int opcion = sc.nextInt();
                    sc.nextLine(); 
    
                    switch (opcion) {
                        case 1:
                            System.out.print("Criterio de búsqueda: ");
                            String criterio = sc.nextLine();
                            Libro.buscarLibro(libros, criterio);
                            break;
    
                        case 2:
                            System.out.print("Libro que se va a prestar: ");
                            String titulo = sc.nextLine();
                            for (Libro libro : libros) {
                                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                                    usuarioActual.prestarLibro(libro);
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
                            Libro.mostrarLibros(libros);
                            break;
    
                        case 5:
                            return;
    
                        default:
                            System.out.println("Opción no valida.");
                    }
                }
            }
        }
    
