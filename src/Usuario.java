import java.util.Scanner;

/**
 * 
 * @autor diego
 */
public class Usuario {
    private String nombre;
    private String password;
    private boolean rolAdministrador;
    private Libro[] librosPrestados;
    private int tamPrestamos = 5;
    private int contadorLibros = 0;
    private int librosEnCesta = 0;

    Usuario() {
        this.nombre = " ";
        this.password = " ";
        this.rolAdministrador = true;
        this.librosPrestados = new Libro[tamPrestamos];

    }

    Usuario(String nombre, String password, boolean rolAdministrador) {
        this.nombre = nombre;
        this.password = password;
        this.rolAdministrador = rolAdministrador;

    }

    public String getNombre() {

        return this.nombre;
    }

    public String getPassword() {

        return this.password;
    }

    public boolean getRolAdministrador() {

        return this.rolAdministrador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRolAdministrador(boolean rolAdministrador) {
        this.rolAdministrador = rolAdministrador;
    }

    public Libro[] getLibrosPrestados() {
        return librosPrestados;

    }

    // metodo creado para que cuando llamemos a usuario le metamos los libros
    // prestados al usuario
    public void prestarLibro(Libro libroPrestado) {
        if (this.contadorLibros < this.librosPrestados.length) {

            for (int i = 0; i < librosPrestados.length; i++) {

                if (librosPrestados[i] == null) {
                    librosPrestados[i] = libroPrestado;
                    librosPrestados[i].setPrestado(true);
                    this.contadorLibros++;
                    break; // ¿Por qué ponemos break en esta sentencia? ¿De qué otra manera se podría haber
                           // hecho?
                }

            }
        } else {

            System.out.println("No puedes llevarte mas libros");
        }

    }

    public boolean devolverLibro(Libro libroPrestado) {
        boolean comprobarDevolucion = false;
        for (int i = 0; i < librosPrestados.length; i++) {
            // ¿Por qué comparamos si NO está vacío?
            if (librosPrestados[i] != null && librosPrestados[i].getTitulo().equals(libroPrestado.getTitulo())) {
                librosPrestados[i].setLibrosPrestados(false);
                this.contadorLibros--;
                librosPrestados[i] = null;
                comprobarDevolucion = true;
                for (int j = i; j < librosPrestados.length - 1; j++) {
                    librosPrestados[j] = librosPrestados[j + 1];
                }

                librosPrestados[librosPrestados.length - 1] = null;
                break;
            }
        }
        return comprobarDevolucion;
    }

    public static Usuario registrarUsuario() {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String password;
        String confirmPassword;
        boolean esAdministrador;

        System.out.println("Registro de usuario");

        System.out.print("Nombre de usuario: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa contraseña: ");
        password = sc.nextLine();

        System.out.print("Confirma contraseña: ");
        confirmPassword = sc.nextLine();

        if (!password.equals(confirmPassword)) {
            System.out.println("No coincide esta contraseña, prueba de nuevo.");
        } else {
            System.out.println("contraseña guardada");
        }
        System.out.print("¿Es usted administrador? (S/N): ");
        String respuesta = sc.nextLine();

        if (respuesta.equals("S")) {
            esAdministrador = true;
            System.out.println("Registrado como administrador.");
        } else {
            esAdministrador = false;
            System.out.println("Registrado como usuario.");
        }

        Usuario nuevoUsuario = new Usuario(nombre, password, esAdministrador);

        System.out.println("Registro realizado.");
        return nuevoUsuario;
    }

    // Metodo para agregar usuario DESDE ADMINISTRADOR
    public static Usuario agregarUsuarioDesdeAdmin() {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String respuesta;
        String password;
        boolean rolAdministrador;

        System.out.println("Agregar nuevo usuario");

        System.out.print("Dime el nombre del usuario: ");
        nombre = sc.nextLine();

        System.out.print("Dime la contraseña del usuario: ");
        password = sc.nextLine();

        System.out.print("¿Es administrador? (S/N): ");
        respuesta = sc.nextLine();
        rolAdministrador = (respuesta.charAt(0) == 'S');

        Usuario nuevoUsuario = new Usuario(nombre, password, rolAdministrador);

        System.out.println("Usuario agregado.");
        return nuevoUsuario;
    }

    /*Menú de inicio o registro y si inicias con administrador 
    tener el menú de agregar libros a la Biblioteca o prestar libros

    Y si inicias con un usuario que salga menú de devolver  libros y agregar 
    libros a mi cesta */



}


