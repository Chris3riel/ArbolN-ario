import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ArbolNArioMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el nodo raíz
        System.out.print("Ingrese el dato del nodo raíz: ");
        String datoRaiz = scanner.nextLine();
        NodoNArio raiz = new NodoNArio(datoRaiz);

        // Agregar hijos al nodo raíz
        agregarHijos(scanner, raiz);

        // Imprimir recorridos
        System.out.println("Recorrido Inorden:");
        recorridoInorden(raiz); 

        System.out.println("\nRecorrido Preorden:");
        recorridoPreorden(raiz);

        System.out.println("\nRecorrido Postorden:");
        recorridoPostorden(raiz);
    }

    private static void agregarHijos(Scanner scanner, NodoNArio nodo) {
        System.out.print("Ingrese la cantidad de hijos para el nodo '" + nodo.getDato() + "': ");
        int cantidadHijos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < cantidadHijos; i++) {
            System.out.print("Ingrese el dato del hijo #" + (i + 1) + " para el nodo '" + nodo.getDato() + "': ");
            String datoHijo = scanner.nextLine();
            NodoNArio hijo = new NodoNArio(datoHijo);

            System.out.print("¿El hijo '" + datoHijo + "' tiene nodos hijos? (si/no): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("si")) {
                agregarHijos(scanner, hijo);
            }

            nodo.agregarHijo(hijo);
        }
    }

   private static void recorridoInorden(NodoNArio nodo) {
    if (nodo != null) {
        // Recorrer el primer hijo
        if (!nodo.getHijos().isEmpty()) {
            recorridoInorden(nodo.getHijos().get(0));
        }
        
        // Imprimir el dato del nodo actual
        System.out.print(nodo.getDato() + " ");

        // Recorrer los demás hijos
        for (int i = 1; i < nodo.getHijos().size(); i++) {
            recorridoInorden(nodo.getHijos().get(i));
        }
    }
}




    private static void recorridoPreorden(NodoNArio nodo) {
        if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
            for (NodoNArio hijo : nodo.getHijos()) {
                recorridoPreorden(hijo);
            }
        }
    }

    /*private static void recorridoPostorden(NodoNArio nodo) {
        if (nodo != null) {
            for (NodoNArio hijo : nodo.getHijos()) {
                recorridoPostorden(hijo);
            }
            System.out.print(nodo.getDato() + " ");
        }
    }*/
    
    private static void recorridoPostorden(NodoNArio nodo) {
    if (nodo != null) {
        for (NodoNArio hijo : nodo.getHijos()) {
            recorridoPostorden(hijo);
        }
        System.out.print(nodo.getDato() + " ");
    }
}

}
