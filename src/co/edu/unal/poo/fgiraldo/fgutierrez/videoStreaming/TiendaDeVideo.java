/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fgiraldo.fgutierrez.videoStreaming;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class TiendaDeVideo {
    
    private String nombre;
    private ArrayList<Video> videos;

    public TiendaDeVideo(String nombre){
        this.nombre = nombre;
        this.videos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    
    public int cantidadTotalVideos(){
        return this.videos.size();
    }

    
    //Listar Nombre todas las series de la Tienda
    public String nombreDeTodosLasSeries(){
        String str = "";
        for (int i = 0; i < this.videos.size(); i++) {
            if (this.videos.get(i) instanceof Serie) {
                str += this.videos.get(i).getTitulo()+"\n";
            }            
        }
        return str;
    }
    
    //Dado el nombre de un tipo de video presentar información 
    public String infoSegunTipo(String tipo){
               
        String str = "";
        for (int i = 0; i < this.videos.size(); i++) {
            if (this.videos.get(i).getClass().getName().equals(tipo)) {
                str += this.videos.get(i).getTitulo();
            }

        }
        return str;
    }
    
    
    
    
    
}
