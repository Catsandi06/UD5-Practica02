package net.salesianos.pelicula;

public class Pelicula {
    private String titulo;
    private String director;
    private int anyo;
    private int puntuacion;

    // Constructor vacío
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int anyo, int puntuacion) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.puntuacion = puntuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", anyo=" + anyo +
                ", puntuacion=" + puntuacion +
                '}';
    }
}