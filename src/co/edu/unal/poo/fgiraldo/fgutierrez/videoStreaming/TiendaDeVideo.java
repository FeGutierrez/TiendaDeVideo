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
    
    
    
    
    
}
