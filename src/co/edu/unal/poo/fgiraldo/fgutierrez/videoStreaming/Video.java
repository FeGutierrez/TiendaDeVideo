/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fgiraldo.fgutierrez.videoStreaming;

/**
 *
 * @author Estudiante
 */
public class Video {
    //Super clase
    
    private String titulo;
    private Director director;
    private int anioPublicacion;

    public Video(String titulo, Director director, int anioPublicacion) {
        this.titulo = titulo;
        this.director = director;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    //Metodos implementados para todos los videos
    public String info(){
        String x = "";
        if (this instanceof Serie) {
            x = "S";
        }
        if (this instanceof Pelicula) {
            x = "P";
        }
        if (this instanceof Documental) {
            x = "D";
        }
        return x + ", " + this.titulo + ", " + this.director.getNombre()+ ", " + this.getAnioPublicacion();
    }
    
    
    
}
