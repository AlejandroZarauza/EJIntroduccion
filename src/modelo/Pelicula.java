package modelo;

public class Pelicula {
    String titulo;
    int ano;
    int duracion;
    double valoracion;
    Director director;

    public Pelicula(String titulo, int ano, int duracion, double valoracion, Director director) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.valoracion = valoracion;
        this.director = director;
    }
}
