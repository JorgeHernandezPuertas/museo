/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author jorge
 */
public abstract class Conservador extends Empleado implements Restaurador {

    public Conservador(String nif, String nombre) {
        super(nif, nombre);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conservador{");
        sb.append('}');
        return sb.toString();
    }  
}
