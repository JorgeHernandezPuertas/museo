/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import obras.Obra;
import obras.Pintura;

/**
 *
 * @author jorge
 */
public final class Escultorico extends Conservador {

    // constructor
    public Escultorico(String nif, String nombre) {
        super(nif, nombre);
    }

    // Método de la interfaz
    @Override
    public void restaurar(Obra obra) {
        // Como es escultorico hago que restaure solo las obras que son esculturas
        if (obra instanceof Pintura){
            System.out.println("El escultorico " + this.getNombre() + " ha restaurado "
                    + "la escultura " + obra.getId());
        } else {
            System.out.println("El restaurador es escultorico y no puede restaurar"
                    + " una pintura.");
        }
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Escultorico{");
        sb.append('}');
        return sb.toString();
    }
    
}
