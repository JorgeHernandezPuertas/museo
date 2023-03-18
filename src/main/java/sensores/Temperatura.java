/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author jorge
 */
public final class Temperatura extends Sensor {
    
    // Atributos
    public final double MAX_TMP;
    public final double MIN_TMP;

    // Constructor
    public Temperatura(double MAX_TMP, double MIN_TMP, String id) {
        super(id);
        this.MAX_TMP = MAX_TMP;
        this.MIN_TMP = MIN_TMP;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Temperatura{");
        sb.append("MAX_TMP=").append(MAX_TMP);
        sb.append(", MIN_TMP=").append(MIN_TMP);
        sb.append('}');
        return sb.toString();
    }

    // Implemento el método abstracto del padre
    @Override
    public void alarma() {
        System.out.println("La temperatura de la sala no está en el rango de "
        + MIN_TMP + " a " + MAX_TMP + " grados.");
    }
    
}
