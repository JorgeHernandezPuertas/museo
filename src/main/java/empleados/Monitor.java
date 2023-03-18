/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author jorge
 */
public final class Monitor extends Empleado {
    
    // Atributo (para que no se quede vacía)
    private String especialidadTour;
    
    // Constructores
    public Monitor(String especialidadTour) {
        this.especialidadTour = especialidadTour;
    }

    public Monitor(String especialidadTour, String nif, String nombre) {
        super(nif, nombre);
        this.especialidadTour = especialidadTour;
    }
    
    // Getter y setter
    public String getEspecialidadTour() {
        return especialidadTour;
    }

    public void setEspecialidadTour(String especialidadTour) {
        this.especialidadTour = especialidadTour;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Monitor{");
        sb.append("especialidadTour=").append(especialidadTour);
        sb.append('}');
        return sb.toString();
    }
    
}
