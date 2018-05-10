/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.fgiraldo.fgutierrez.videoStreaming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Crear la video Tienda
        TiendaDeVideo tv = new TiendaDeVideo("gggggg");
        Director director = new Director("Edison Florez");
        Documental doc1 = new Documental("Tecnologia", "Retos de la Ética en el campo de la ingeniería genética", director, 2018);
        Serie serie1 =  new Serie(10, 5, "RRRR & SSSS", director, 2017);
        Pelicula film1 = new Pelicula("Matrix", director, 1999);
        tv.getVideos().add(doc1);
        tv.getVideos().add(serie1);
        tv.getVideos().add(film1);
        
        //Ahora el archivo
        File archivo = new File("VideoTienda.txt");
        
        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado");
                }
            } catch (IOException ex) {
                System.out.println("Prohibido crear el archivo");
            }
        }
        PrintStream flujoSalida = null;
        try {
            File salida = new File("VideoTienda.txt");
            flujoSalida = new PrintStream(salida);
            flujoSalida.println(tv.cantidadTotalVideos()+"\n");
            
            for (int i = 0; i < tv.getVideos().size(); i++) {
                flujoSalida.println(tv.getVideos().get(i).info());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No existe archivo");
        } finally {
            flujoSalida.close();
            try {
                Scanner sc = new Scanner(archivo);
                while(sc.hasNext()){
                    System.out.print(sc.next());
                }
            } catch (Exception e) {
            }
            
            
        }
        
    }
}
