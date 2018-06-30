package ejercicios6;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicios 
{
    static void guardar(String nombre_archivo, ArrayList<Pelicula> peliculas)
    {
        try
        {
            PrintWriter p1 = new PrintWriter(nombre_archivo);

            for(Pelicula movie : peliculas)
            {
                p1.println(movie.nombre + " " + movie.descripcion+" "+ movie.duracion);
            }

            p1.close();
        }catch (Exception e)
        {
            System.out.println("Ocurrio un error al guardar.");
        }
    }


    static ArrayList<Pelicula> abrir(String nombre_archivo)
    {
       ArrayList<Pelicula> p2= new ArrayList<>(); 
        try
        {
            Scanner scanner = new Scanner(new File(nombre_archivo));
            while(scanner.hasNext())
            {
                String nombre = scanner.next();
                String descripcion = scanner.next();
                int duracion = scanner.nextInt();
                p2.add (new Pelicula(nombre, descripcion, duracion) );
            }
            scanner.close();
        }
        catch(Exception e)
        {
            System.out.print("Error al leer el archivo");
        }
        return p2;
    }
}
