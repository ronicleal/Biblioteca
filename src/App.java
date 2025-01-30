import java.util.Scanner;

public class App  {
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
            System.out.println("----MENU BIBLIOTECA DESDE ADMINISTRADOR----");//cambiar esto por el de Diego
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

        /*AL INICIAR SESION QUE ACCEDAMOS AL MENU DE USUARIO Y EN ADMI AL MENU ADMIN */





        

        
        

        

        



        

       
        


      



    }
}
