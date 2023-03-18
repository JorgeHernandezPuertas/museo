/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author jorge
 */
public class Humedad extends Sensor {
    
    // Atributos
    public final int MAX_HUM;
    public final int MIN_HUM;
    
    // Constructor
    public Humedad(int MAX_HUM, int MIN_HUM, String id) {
        super(id);
        this.MAX_HUM = MAX_HUM;
        this.MIN_HUM = MIN_HUM;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Humedad{");
        sb.append("MAX_HUM=").append(MAX_HUM);
        sb.append(", MIN_HUM=").append(MIN_HUM);
        sb.append('}');
        return sb.toString();
    }

    // Implemento el método abstracto del padre
    @Override
    public void alarma() {
        System.out.println("La humedad de la sala no esta en el rango de "
         + MIN_HUM + " a " + MAX_HUM);
    }
    
    
    
}
