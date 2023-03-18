/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public abstract class Empleado implements Comparable<Empleado> {
    
    // Atributos
    private String nif;
    private String nombre;
    
    // Constructores
    public Empleado() {
    }
    
    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    // Getters
    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos equals y hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nif);
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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nif=").append(nif);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    // Implemento el comparable en el padre porque quiero que todos los hijos 
    // se comparen por el nif y así me ahorro repetirlo en cada hijo
    @Override
    public int compareTo(Empleado o) {
        return this.getNif().compareToIgnoreCase(o.getNif());
    }
    
}
