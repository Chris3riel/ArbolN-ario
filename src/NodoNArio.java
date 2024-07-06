import java.util.ArrayList;
import java.util.List;

public class NodoNArio {
    private String dato;
    private List<NodoNArio> hijos;

    public NodoNArio(String dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    public String getDato() {
        return dato;
    }

    public List<NodoNArio> getHijos() {
        return hijos;
    }

    public void agregarHijo(NodoNArio hijo) {
        hijos.add(hijo);
    }
}
