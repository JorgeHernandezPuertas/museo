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
public final class Pictorico extends Conservador {

    @Override
    public void restaurar(Obra obra) {
        // Como es pictorico hago que restaure solo las obras que son pinturas
        if (obra instanceof Pintura){
            System.out.println("El pictorico " + this.getNombre() + " ha restaurado "
                    + "la pintura " + obra.getId());
        } else {
            System.out.println("El restaurador es pictorico y no puede restaurar"
                    + " una escultura.");
        }
        
    }
    
}
