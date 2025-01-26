//TENGO QUE CREAR UN ARRAY DE USUARIOS Y LLAMARLO EN EL METODO DE CONSULTA

public class Usuario {
    private String nombre;
    private String correo;
    private String password;
    private boolean rolAdministrador;
    private String usuarioRegistrado;
    

    Usuario() {
        this.nombre = " ";
        this.correo = " ";
        this.password = " ";
        this.rolAdministrador = true;
        this.usuarioRegistrado = " ";

    }

    Usuario(String nombre, String correo, String password, boolean rolAdministrador) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rolAdministrador = rolAdministrador;
        this.usuarioRegistrado = usuarioRegistrado;

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

    public String getUsuarioRegistrado() {

        return this.usuarioRegistrado;
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

    public void setRol(boolean rolAdministrador) {
        this.rolAdministrador = rolAdministrador;
    }

    public void setUsuarioRegristrado(String usuariosRegistrado) {
        this.nombre = usuariosRegistrado;
    }

    // METODO PARA REGISTRAR USUARIOS SOLO SI ERES ADMINISTRADOR (no entiendo porque un usuario normal no se puede registrar por su cuenta)
    
    public static boolean registrarUsuario (String nombre, String correo, String password, boolean rolAdministrador) {
        
        if (!rolAdministrador) {
            System.out.println("Los usuarios solo pueden ser registrados por un administrador");
            return false;
        }

        return true; 

        
}

// METODO PARA CONSULTAR USUARIOS REGISTRADOS DESDE ADMINISTRADOR

public void consultarUsuariosRegistrados() {
    if (!this.rolAdministrador) {
        System.out.println("Acceso denegado");
        
    }

    System.out.println("Lista de usuarios registrados: ");
    //FOR PARA RECORRER Y MOSTRAR EL ARRAY CON LOS USUARIOS REGISTRADOS
    



}
}






    

   




