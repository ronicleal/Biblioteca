import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    /*Atributos */
    private Libro[]Libros;
    private Usuario[]Usuario;
    private int tamLibro=50;
    private int tamUsuario=50;
    private int contadorLibros;
 

   /*CONTRUCTOR POR DEFECTO */
    Biblioteca(){
        Libros= new Libro[tamLibro];
        Usuario= new Usuario[tamUsuario];
        contadorLibros=0;
        

    }

    Biblioteca(int tamLibro, int tamUsuario){
        this.tamLibro=tamLibro;
        this.tamUsuario=tamUsuario;
        Libros=new Libro[tamLibro];
        Usuario=new Usuario[tamUsuario];
    }

    /*GETTERS */

    public Libro[] getLibros(){
        return Libros;
    }

    public Usuario[] getUsuarios(){
        return Usuario;
    }

    public int gettamLibro(){
        return tamLibro;
    }

    public int gettamUsuario(){
        return tamUsuario;
    }

    /*SETTERS */

    public void setLibros(Libro[] libros){
        this.Libros=libros;
    }

    public void setUsuarios(Usuario[] usuarios){
        this.Usuario=usuarios;
    }

    public void settamLibro(int tamLibro){
        this.tamLibro=tamLibro;
        Libros= new Libro[tamLibro];
    }

    public void settamUsuario(int tamUsuario){
        this.tamUsuario=tamUsuario;
        Usuario= new Usuario[tamUsuario];
    }


    /*METODOS */

    public void agrearLibro(Libro libro){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Titulo del libro: ");
        String titulo= sc.nextLine();

        System.out.println("Autor del libro:");
        String autor= sc.nextLine();

        System.out.println("Categoria del libro:");
        String categoria= sc.nextLine();

        for(int i=0; i<tamLibro;i++){
            if(Libros[i] != null && Libros[i].getTitulo().equals(titulo)){
                System.out.println("Este libro ya exsite");
                return;
            }
        }

        for(int i=0; i<tamLibro;i++){
           if(Libros[i]==null && Libros.length > contadorLibros){
            Libros[i]=libro;
            System.out.println("Libro agregado");
            contadorLibros++;
            return;
           }
        }

        System.out.println("Espacio completo");


    }

    public void eliminarLibro(String titulo){
        boolean encontrado=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del libro a eliminar: ");
        titulo= sc.nextLine();

        for(int i=0;i<tamLibro;i++){
            if(Libros[i]!=null && Libros[i].getTitulo().equals(titulo)){
                Libros[i]=null;
                System.out.println("El libro " + titulo + "ha sido eliminado");
                encontrado=false;
                break;
            }
        }

        if(!encontrado){
            System.out.println("El libro " + titulo + "no se encontró en la colección ");
        }


        
        
       
    }

    public void mostrarLibros(String titulo, String autor, String categoria){

    boolean hayLibros= false;

    System.out.println("Lista de libros en la colección: ");
    for(int i=0; i<tamLibro;i++){
        if(Libros[i] !=null){
            System.out.println("Titulo: " + Libros[i].getTitulo());
            System.out.println("Autor: " + Libros[i].getAutor());
            System.out.println("Categoria " + Libros[i].getCategoria());
            System.out.println("-------------------------------------");
            hayLibros=true;
        }
    }
    
    if(!hayLibros){
        System.out.println("No hay libros en la colección");
    }


    }

}


   



