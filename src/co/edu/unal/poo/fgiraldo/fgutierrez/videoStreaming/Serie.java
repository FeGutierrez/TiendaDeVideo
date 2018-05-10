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
public class Serie extends Video implements MetodosGlobales{
    
    private int numeroEpisodios;
    private int temporada;

    public Serie(int numeroEpisodios, int temporada, String titulo, Director director, int anioPublicacion) {
        super(titulo, director, anioPublicacion);
        this.numeroEpisodios = numeroEpisodios;
        this.temporada = temporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    //Métodos exclusivos de las series
    public int episodiosXTemporadaAsumiendoCantidadUniformedeEpisodios(int numeroDeTemporadas){
        return this.numeroEpisodios / numeroDeTemporadas;
    }
    
    //
    @Override
    public String listarPrestamistas() {
        String a = "";
        return a;
    }
    
    @Override
    public int promedioPrestamosMensuales() {
        return 0;
    }
    
    @Override
    public double calcularGananciasXPrestamos(){
        return 0.0;
    }
    
    @Override
    public String info(){
        return super.info() + ", " + this.getNumeroEpisodios()+ ","
                +this.temporada;
    }
    
}
