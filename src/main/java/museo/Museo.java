/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import empleados.Empleado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import salas.Sala;

/**
 *
 * @author jorge
 */
public class Museo {
    
    // Atributos
    private String nombre;
    private String direccion;
    private Map<String, Sala> salas; // La id de la sala es la key
    private List<Empleado> empleados; // Uso un set para no tener empleados repetidos
    
    // Constructor
    public Museo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = new HashMap<>();
        this.empleados = new ArrayList<>();
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<String, Sala> getSalas() {
        return salas;
    }

    public void setSalas(Map<String, Sala> salas) {
        this.salas = salas;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    // Métodos equals y hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.direccion);
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
        final Museo other = (Museo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", salas=").append(salas);
        sb.append(", empleados=").append(empleados);
        sb.append('}');
        return sb.toString();
    }
    
    // Método para contratar a un empleado
    public boolean contratarEmpleado(Empleado empleado){
        return this.empleados.add(empleado);
    }
    
    // Método para despedir un empleado
    public boolean despedirEmpleado(Empleado empleado){
        return this.empleados.remove(empleado);
    }
    
    // Método para añadir una sala
    public boolean anadirSala(Sala sala){
        // Añado la sala y si me devuelve null es que se ha añadido una nueva
        // y me devuelve un objeto que no sea null es que ya estaba
        Object valor = this.salas.put(sala.getId(), sala);
        return (valor == null) ? true:false;
    }
    
    // Método para quitar una sala
    public boolean quitarSala(Sala sala){
        return this.salas.remove(sala.getId(), sala);
    }
    
}
