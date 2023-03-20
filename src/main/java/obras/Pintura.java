/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obras;

/**
 *
 * @author jorge
 */
public final class Pintura extends Obra {
    
    // Atributo
    private String estilo;

    // Constructor
    public Pintura(String estilo, String id, String autor) {
        super(id, autor);
        this.estilo = estilo;
    }

    // Getter y setter
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cuadro{");
        sb.append("estilo=").append(estilo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
