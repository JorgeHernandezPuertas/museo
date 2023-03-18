/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author jorge
 */
public final class Vigilante extends Empleado {
    
    // Atributos
    private String turno;

    // Constructores
    public Vigilante() {
    }

    public Vigilante(String turno, String nif, String nombre) {
        super(nif, nombre);
        this.turno = turno;
    }

    // Getter y setter
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Vigilante{");
        sb.append("turno=").append(turno);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
