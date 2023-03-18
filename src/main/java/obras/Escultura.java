/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obras;

/**
 *
 * @author jorge
 */
public final class Escultura extends Obra {
    
    // Atributo
    private String epoca;

    // Constructor
    public Escultura(String epoca, String id, String autor) {
        super(id, autor);
        this.epoca = epoca;
    }

    // getter y setter
    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Escultura{");
        sb.append("epoca=").append(epoca);
        sb.append('}');
        return sb.toString();
    }
    
}
