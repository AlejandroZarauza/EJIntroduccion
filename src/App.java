import modelo.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    Videoteca videoteca = null;
    int opcion=0;

        while (opcion != 5) {
            System.out.println("--------------------------------------");
            System.out.println("MI VIDEOTECA");
            System.out.println("--------------------------------------");
            System.out.println("1) Nueva videoteca de películas");
            System.out.println("2) Configurar velocidad de reproducción");
            System.out.println("3) Añadir una nueva película a la vidioteca");
            System.out.println("4) Mostrar información actual de las películas");
            System.out.println("5) Salir (Se borrara toda la información)");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                System.out.print("Ingrese el tamaño de la videoteca: ");
                    int tamano = sc.nextInt();
                    sc.nextLine();
                    videoteca = new Videoteca(tamano);
                    System.out.println("Videoteca creada con espacio para " + tamano + " películas.");
                    
                break;
                case 2:
                 if (videoteca == null) {
                        System.out.println("Primero debe crear una videoteca (opción 1).");
                    } else {
                        System.out.print("Ingrese la nueva velocidad de reproducción (ej: 1.5): ");
                        double velocidad = sc.nextDouble();
                        sc.nextLine();
                        videoteca.setVelocidad(velocidad);
                    }
                    
                break;
                case 3:
                if (videoteca == null) {
                        System.out.println("Primero debe crear una videoteca (opción 1).");
                    } else if (videoteca.getCantidadPeliculas() >= videoteca.getTamano()) {
                        System.out.println("La videoteca está llena, no puede añadir más películas.");
                    } else {
                        System.out.println("Ingrese los datos de la película:");
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Año de estreno: ");
                        int ano = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Duración (min): ");
                        int duracion = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Valoración (0-10): ");
                        double valoracion = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Ingrese los datos del director:");
                        System.out.print("Nombre: ");
                        String nombreDir = sc.nextLine();
                        System.out.print("Apellidos: ");
                        String apellidosDir = sc.nextLine();
                        System.out.print("¿Ha ganado un Oscar? (true/false): ");
                        boolean oscar = sc.nextBoolean();
                        sc.nextLine();

                        Director director = new Director(nombreDir, apellidosDir, oscar);
                        Pelicula pelicula = new Pelicula(titulo, ano, duracion, valoracion, director);

                        videoteca.agregarPelicula(pelicula);
                    }
                
                    
                break;
                case 4:
                 if (videoteca == null || videoteca.getCantidadPeliculas() == 0) {
                        System.out.println("No hay información para mostrar.");
                    } else {
                        videoteca.mostrarInformacion();
                    }
                    
                break;
                case 5:
                System.out.println("Saliendo de la vidioteca.");
                break;
                    
                default:
                System.out.println("Opción no valida");
                
            }
            
            }


















            sc.close();
        }
    }

