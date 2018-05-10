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
public class Documental extends Video implements MetodosGlobales{
    
    private String genero;

    public Documental(String genero, String titulo, Director director, int anioPublicacion) {
        super(titulo, director, anioPublicacion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //Métodos exclusivos de los documentales
    public int cantidadDeContenidoRelacionado(){
        return 0;
    }
    
    //Implemntados
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
        return super.info() + ", " + this.getGenero();
    }
    
}
