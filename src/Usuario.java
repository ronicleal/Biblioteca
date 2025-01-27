public class Usuario {
    private String nombre;
    private String correo;
    private String password;
    private boolean rolAdministrador;

    //no lo he hecho yo (sabia lo que tenia que hacer pero NO como formarlo)
    private static Usuario[] usuariosRegistrados = new Usuario[100];
    private static int contadorUsuarios = 0;
    //hasta aqui

    Usuario() {
        this.nombre = " ";
        this.correo = " ";
        this.password = " ";
        this.rolAdministrador = true;

    }

    Usuario(String nombre, String correo, String password, boolean rolAdministrador) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rolAdministrador = rolAdministrador;

    }

    public String getNombre() {

        return this.nombre;
    }

    public String getCorreo() {

        return this.correo;
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

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRolAdministrador(boolean rolAdministrador) {
        this.rolAdministrador = rolAdministrador;
    }

    // no entiendo porque tengo que registrar desde administrador... un usuario no deberia poder hacerlo por su cuenta???
    
    public static boolean registrarUsuario(String nombre, String correo, String password, boolean rolAdministrador) {

        if (!rolAdministrador) {
            System.out.println("Acceso denegado, tienes que ser administrador");
            return false;

        } else {

            //No lo he hecho yo

            Usuario nuevoUsuario = new Usuario(nombre, correo, password, rolAdministrador);
            usuariosRegistrados[contadorUsuarios] = nuevoUsuario;
            contadorUsuarios++;

            //Hasta aqui
            System.out.println("Usuario registrado con exito");
            return true;

        }

    }

    
    public static void consultarUsuariosRegistrados(Usuario admin) {
      
        if (!admin.rolAdministrador) {
            System.out.println("Acceso denegado, tienes que ser administrador");
            
        }

        System.out.println("Lista de usuarios registrados: ");
        for (int i = 0; i < contadorUsuarios; i++) {
            Usuario usuario = usuariosRegistrados[i]; //en esta linea he necesitado ayuda
            System.out.println("Nombre: " + usuario.nombre + ", Correo: " + usuario.correo + ", Rol: " //me daba error y buscando en internet me ha puesto "usuario.nombre etc"
                    + (usuario.rolAdministrador ? "Administrador" : "Usuario"));
        }
    }
}