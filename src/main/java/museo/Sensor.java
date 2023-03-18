/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public abstract class Sensor {
 
    // Atributo
    private String id;
    
    // Constructores
    public Sensor() {
    }

    public Sensor(String id) {
        this.id = id;
    }

    // Getter
    public String getId() {
        return id;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    // métodos equals y hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final Sensor other = (Sensor) obj;
        return Objects.equals(this.id, other.id);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sensor{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    
    // Método abstracto de alarma
    public abstract void alarma();
    
    
}
