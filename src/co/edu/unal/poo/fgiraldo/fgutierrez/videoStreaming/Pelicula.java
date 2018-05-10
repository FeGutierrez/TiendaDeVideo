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
public class Pelicula extends Video implements MetodosGlobales{

    public Pelicula(String titulo, Director director, int anioPublicacion) {
        super(titulo, director, anioPublicacion);
    }
    
    //Métodos exclusivos de las películas
    public boolean esUnHuevodePascua(){
        return true;
    }
    
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
        return super.info();
    }
    

}
