/*Sistema de Gestión de Biblioteca Digital
Descripción del Proyecto
El sistema permitirá gestionar una colección de libros y usuarios de la biblioteca.

Sistema de roles
Se deberá implementar un sistema que permita diferenciar los administradores de los usuarios, así como las acciones disponibles para ellos.

Funcionalidades Principales
Gestión de Libros:

Agregar libros nuevos.(admin)
Eliminar libros existentes.(admin)
Buscar libros por título, autor o categoría.(todos)
Mostrar todos los libros disponibles.(todos)
Gestión de Usuarios:

Registrar nuevos usuarios.(admin)
Consultar información de usuarios registrados.(admin)

Gestión de Préstamos:

Realizar préstamos de libros.(todos)
Devolver libros prestados.(todos)
Mostrar libros actualmente prestados.(admin)
Estadísticas y Reportes:

Mostrar número de préstamos totales y activos.
Listar los libros más prestados.
Mostrar qué usuario tiene más préstamos activos.
Requerimientos Técnicos
Usa arrays para almacenar libros y usuarios.

Consola interactiva para que el usuario pueda realizar operaciones mediante un menú.

Ejecución de la aplicación
Al iniciar la aplicación se crearán algunos usuarios y libros de prueba. Posteriormente aparecerá una pantalla de login. Tras introducir un nombre de usuario y una contraseña, aparecerá un menú con las distintas opciones de la librería, que serán distintas dependiendo del rol del usuario.

Las distintas opciones podrán ejecutarse indefinidamente, hasta que se seleccione la opción de salir.

Entrega y trabajo en equipo
La actividad debe realizarse en parejas y la entrega debe realizarse mediante GitHub. Consideraciones:

Uno de los miembros de la pareja deberá crear un repositorio donde ambos trabajarán.
El proyecto es perfectamente paralelizable, tras un análisis inicial donde se decidirán las clases y atributos que intervienen, cada miembro del equipo trabajará en su parte asignada.
Se realizarán commits habitualmente al repositorio (se revisará el trabajo de cada miembro del equipo).
El proyecto incluirá bajo una etiqueta de tipo @author el nombre de los participantes.
En la entrega se añadirá un enlace al repositorio (deberá ser público). */

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
