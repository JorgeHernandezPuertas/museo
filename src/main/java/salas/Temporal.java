/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salas;

import java.time.LocalDate;
import sensores.Humedad;
import sensores.Temperatura;

/**
 *
 * @author jorge
 */
public final class Temporal extends Sala {
    
    // Atributos
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    
    // Constructor
    public Temporal(LocalDate fechaIni, LocalDate fechaFin, String id, Humedad sensorHum, Temperatura sensorTemp) {
        super(id, sensorHum, sensorTemp);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    // Getters y setters
    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Temporal{");
        sb.append("fechaIni=").append(fechaIni);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
