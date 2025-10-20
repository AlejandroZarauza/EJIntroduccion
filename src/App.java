import modelo.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    // Inicializar vector en un futuro

    int opcion=0;

        while (opcion != 5) {
            System.out.println("MI VIDEOTECA");
            System.out.println("--------------------------------------");
            System.out.println("1) Nueva videoteca de películas");
            System.out.println("2) Configurar velocidad de reproducción");
            System.out.println("3) Añadir una nueva película a la vidioteca");
            System.out.println("4) Mostrar información actual de las películas");
            System.out.println("5) Salir (Se borrara toda la información)");
            System.out.print("Seleccione una opción: ");
            
            opcion = scan.nextInt();
            scan.nextLine(); 

            switch (opcion) {
                case 1:
                    
                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                case 5:
                System.out.println("Saliendo de la vidioteca.");
                break;
                    
                default:
                System.out.println("Opción no valida");
                
            }
            
            }


















            scan.close();
        }
    }

