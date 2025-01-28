public class Usuario {
 String nombre;
 String password;
 boolean rol;
 


    Usuario(){
        nombre="";
        password="";
        rol=true;

    }

    Usuario(String nombre, String password, boolean rol){
        this.nombre=nombre;
        this.password=password;
        this.rol=rol;
    }

    /*GETTERS */
    public String getnombre(){
        return nombre;
    }

    public String getpassword(){
        return password;
    }

    public boolean getrol(){
        return rol;
    }

    /*SETTERS */
    
    
}

