/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salas;

import sensores.Humedad;
import sensores.Temperatura;

/**
 *
 * @author jorge
 */
public final class Fija extends Sala {
    
    // Atributos
    private String estado;
    
    // Constructor
    public Fija(String estado, String id, Humedad sensorHum, Temperatura sensorTemp) {
        super(id, sensorHum, sensorTemp);
        this.estado = estado;
    }

    // Getter y setter
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Fija{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
}
