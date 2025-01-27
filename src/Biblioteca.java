import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    /*Atributos */
    private Libro[]Libros;
    private Usuario[]Usuario;
    private int tamLibro=;
    private int tamUsuario=0;
 

   /*CONTRUCTOR POR DEFECTO */
    Biblioteca(){
        Libros= new Libro[tamLibro];
        Usuario= new Usuario[tamUsuario];
        

    }

    /*METODOS */

    public void agrearLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el titulo del libro: ");
        String titulo= sc.nextLine();

        System.out.println("Introduce el autor del libro: ");
        String autor=sc.nextLine();

        System.out.println("Introduce la categoria del libro: ");
        String categoria=sc.nextLine();

        libros.add(new Libro(titulo, autor, categoria));
        System.out.println("¡Libro agregado exitosamente!");



    }

    public void eliminarLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del libro a eliminar: ");
        String titulo= sc.nextLine();
        
        if(libros.equals(titulo)){
            libros.remove(titulo);/*removeIf eliminina si el libro conincide con el titulo, el removeIf es como un booleano que elimina si encuentra la conicidencia */
            System.out.println("Libro eliminado");
        }
         
       
    }

    public void mostrarLibros(){

        if(libros.isEmpty()){/*el isEmpty verifica si el arraylibros esta vacio, es un metodo de clase Colletion(Clase reservada) */
            System.out.println("No hay libros disponibles");

        }else{
            for(int i=0; i<libros.size();i++){
                System.out.println(libros.get(i));/*mostramos los libros que hay en el array */
            }
        }

    }


}


