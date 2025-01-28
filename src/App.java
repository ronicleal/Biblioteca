import java.util.Scanner;

public class App {
    /**
     * @autor Diego y Ronic
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Biblioteca GuerreroLeal = new Biblioteca(50, 50);
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        do{
            System.out.println("----MENU BIBLIOTECA GUERRERO-LEAL----");
            System.out.println("1.Agregar libro");
            System.out.println("2.Eliminar libro");
            System.out.println("3.Mostrar libros");
            System.out.println("4.Salir");
            System.out.println("Seleccione una opción");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                GuerreroLeal.agrearLibro(null);
                    break;
                
                case 2:
                GuerreroLeal.eliminarLibro(null);
                    break;

                case 3:
                GuerreroLeal.mostrarLibros(null, null, null);
                    break;
                
                case 4:
                System.out.println("Saliendo del programa...");
                    break;
                default:
                System.out.println("Opción no válida. Intente de nuevo.");
                    
            }

        }while(opcion!=4);
        sc.close();





        

        // Biblioteca GuerreroLeal = new Biblioteca(50, 50);

        // Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Literatura");
        // Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela");
        // Libro libro3 = new Libro("Juegos del hambre", "Suzanne Collins", "Novela");
        // Libro libro4 = new Libro("Harry Potter y la piedra filosofal ", "Harry Potter", "Fantasia");
        // Libro libro5 = new Libro("El código Da Vinci", "Dan Brown", "Novela");

        // GuerreroLeal.agrearLibro(libro1);
        // GuerreroLeal.agrearLibro(libro2);
        // GuerreroLeal.agrearLibro(libro3);
        // GuerreroLeal.agrearLibro(libro4);
        // GuerreroLeal.agrearLibro(libro5);

        /*Usuario usuario1 = new Usuario(nombre:"Ronic"; rol:"false"; password:"1234") */
        /*Usuario usuario2 = new Usuario(nombre:"Diego"; rol:"false"; password:"5678") */
        /*Usuario usuario2 = new Usuario(nombre:"Jorge"; rol:"false"; password:"9999") */
        /*Usuario usuario3 = new Usuario(nombre:"Admin"; rol:"true"; password:"admi") */

        /*usuario1.prestarLibro(libro1) */

     

        

        

        



        

       
        


      



    }
}
