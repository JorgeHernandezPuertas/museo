/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import empleados.Escultorico;
import empleados.Pictorico;
import java.util.HashSet;
import java.util.Set;
import obras.Escultura;
import obras.Obra;
import obras.Pintura;
import salas.Fija;
import salas.Sala;
import sensores.Humedad;
import sensores.Temperatura;

/**
 *
 * @author jorge
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Creo el museo
        Museo museo = new Museo("Museo del Prado", "Madrid");
        
        // Añado las dos salas del enunciado
        // Creo dos conjuntos de obras, uno con un cuadro y otro con una escultura
        Set<Obra> pinturas = new HashSet<>();
        Set<Obra> esculturas = new HashSet<>();
        pinturas.add(new Pintura("punteo", "1", "jorge"));
        esculturas.add(new Escultura("Medieval", "2", "dario"));
        
        // Creo la sala con la pintura
        museo.anadirSala(new Fija("bueno", "1", 
                new Humedad(10, 0, "1"), 
                new Temperatura(27, 0, "2"), pinturas));
        // Creo la sala con la escultura
        museo.anadirSala(new Fija("regular", "2", 
                new Humedad(10, 0, "3"), 
                new Temperatura(27, 0, "4"), esculturas));
        
        // Contrato a un conservador escultorico y a uno pictorico
        museo.contratarEmpleado(new Pictorico("123", "manolo"));
        museo.contratarEmpleado(new Escultorico("321", "manuel"));
        
        // Hago el que el restaurador pictorico intente restaurar todas las obras
        // del museo
        for(Sala sala:museo.getSalas()){
            
        }
        
    }
}
