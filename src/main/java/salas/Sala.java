/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salas;

import java.util.Objects;
import sensores.Humedad;
import sensores.Sensor;
import sensores.Temperatura;

/**
 *
 * @author jorge
 */
public abstract class Sala {
    
    // Atributos
    private String id;
    private Sensor[] sensores;
    
    // Constructor
    public Sala(String id, Humedad sensorHum, Temperatura sensorTemp) {
        this.sensores = new Sensor[2];
        this.sensores[0] = sensorHum;
        this.sensores[1] = sensorTemp;
    }

    // Getter
    public Sensor[] getSensores() {
        return sensores;
    }

    public String getId() {
        return id;
    }

    // Métodos equals y hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sala other = (Sala) obj;
        return Objects.equals(this.id, other.id);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala{");
        sb.append("id=").append(id);
        sb.append(", sensores=").append(sensores);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
