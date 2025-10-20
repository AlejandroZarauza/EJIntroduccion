package modelo;

public class Videoteca {
    public Pelicula[] peliculas;
    public double velocidad; 
    public int cantidadPeliculas; 

    
    public Videoteca(int tamano) {
        peliculas = new Pelicula[tamano];
        velocidad = 1.0; 
        cantidadPeliculas = 0;
    }

    // Método para configurar la velocidad
    public void setVelocidad(double velocidad) {
        if (velocidad > 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad debe ser positiva.");
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    // Método para añadir una nueva película
    public boolean agregarPelicula(Pelicula pelicula) {
        if (cantidadPeliculas < peliculas.length) {
            peliculas[cantidadPeliculas] = pelicula;
            cantidadPeliculas++;
            return true;
        } else {
            System.out.println("No se pueden agregar más películas, la videoteca está llena.");
            return false;
        }
    }

    // Mostrar información en formato tabla
    public void mostrarInformacion() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("| Titulo | Año Estreno | Director | Oscar ganado | Duración (min) | Tiempo visionado (min) | Valoración |");
        System.out.println("----------------------------------------------------------------------------");

        int tiempoTotal = 0;
        double valoracionTotal = 0.0;

        for (int i = 0; i < cantidadPeliculas; i++) {
            Pelicula p = peliculas[i];
            int tiempoVisionado = (int)(p.duracion / velocidad);
            tiempoTotal += tiempoVisionado;
            valoracionTotal += p.valoracion;

            System.out.printf("| %s | %d | %s %s | %s | %d | %d | %.1f |\n",
                    p.titulo,
                    p.ano,
                    p.director.nombre,
                    p.director.apellidos,
                    p.director.oscar ? "Sí" : "No",
                    p.duracion,
                    tiempoVisionado,
                    p.valoracion
            );
        }

        double valoracionPromedio = cantidadPeliculas > 0 ? valoracionTotal / cantidadPeliculas : 0;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Tiempo de visionado total de la videoteca: " + tiempoTotal + " min");
        System.out.println("Valoración total de la videoteca: " + valoracionPromedio);
        System.out.println("----------------------------------------------------------------------------");
    }

  }
