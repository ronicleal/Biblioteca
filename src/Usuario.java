/**
     * 
     * @autor diego
     */
public class Usuario {
    private String nombre;
    private String password;
    private boolean rolAdministrador;
    private Libro [] librosPrestados;
    private int tamPrestamos = 5;
    private int contadorLibros = 0;


    Usuario() {
        this.nombre = " ";
        this.password = " ";
        this.rolAdministrador = true;
        this.librosPrestados = new Libro[tamPrestamos];

    }

    Usuario(String nombre, String correo, String password, boolean rolAdministrador) {
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

    public Libro[] getLibrosPrestados(){
        return librosPrestados;


    }

// metodo creado para que cuando llamemos a usuario le metamos los libros prestados al usuario
    public void prestarLibro(Libro libroPrestado ){
if (this.contadorLibros < this.librosPrestados.length){

    for(int i=0; i<librosPrestados.length; i++ ){

        if(librosPrestados[i]== null){
            librosPrestados[i] = libroPrestado;
            librosPrestados[i].setPrestado(true);
            this.contadorLibros++;
            break; //¿Por qué ponemos break en esta sentencia? ¿De qué otra manera se podría haber hecho?
        }


    }
}else{

    System.out.println("No puedes llevarte mas libros");
}
        

    }

    public boolean devolverLibro(Libro libroPrestado) {
        boolean comprobarDevolucion=false;
        for(int i=0; i<librosPrestados.length; i++){
            //¿Por qué comparamos si NO está vacío?
            if (librosPrestados[i] != null && librosPrestados[i].getTitulo().equals(libroPrestado.getTitulo())) {
                librosPrestados[i].setLibrosPrestados(false);
                this.contadorLibros--;
                librosPrestados[i]=null;
                comprobarDevolucion=true;
                for (int j = i; j < librosPrestados.length - 1; j++) {
                    librosPrestados[j] = librosPrestados[j + 1];
                }
    
                // Asegurar que la última posición sea null
                librosPrestados[librosPrestados.length - 1] = null;
            break;
            }
        }
        return comprobarDevolucion;
    }




    // no entiendo porque tengo que registrar desde administrador... un usuario no deberia poder hacerlo por su cuenta???
    
    // public static boolean registrarUsuario(String nombre, String correo, String password, boolean rolAdministrador) {

    //     if (!rolAdministrador) {
    //         System.out.println("Acceso denegado, tienes que ser administrador");
    //         return false;

    //     } else {

    //         //No lo he hecho yo

    //         Usuario nuevoUsuario = new Usuario(nombre, correo, password, rolAdministrador);
    //         usuariosRegistrados[contadorUsuarios] = nuevoUsuario;
    //         contadorUsuarios++;

    //         //Hasta aqui
    //         System.out.println("Usuario registrado con exito");
    //         return true;

    //     }

    // }

    
    // public static void consultarUsuariosRegistrados(Usuario admin) {
      
    //     if (!admin.rolAdministrador) {
    //         System.out.println("Acceso denegado, tienes que ser administrador");
            
    //     }

    //     //porque tengo que poner (usuario admin) y !admin.rolAdministrador en un void... y no me deja poner el metodo en BOOLEAN igual que el de registrar usuario???

    //     System.out.println("Lista de usuarios registrados: ");
    //     for (int i = 0; i < contadorUsuarios; i++) {
    //         Usuario usuario = usuariosRegistrados[i]; //en esta linea he necesitado ayuda
    //         System.out.println("Nombre: " + usuario.nombre + ", Correo: " + usuario.correo + ", Rol: " //me daba error y buscando en internet me ha puesto "usuario.nombre etc"
    //                 + (usuario.rolAdministrador ? "Administrador" : "Usuario"));
    //     }
    // }
}