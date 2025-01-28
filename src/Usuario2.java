public class Usuario2 {
 String nombre;
 String password;
 boolean rol;
 


    Usuario2(){
        nombre="";
        password="";
        rol=true;

    }

    Usuario2(String nombre, String password, boolean rol){
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

