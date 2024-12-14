package usandopilascolas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

    /**
     * Crea una cola con elementos intercalados pertenecientes a otras dos colas
     *
     * @param c1
     * @param c2
     * @return
     */
    public static Queue<Integer> crearCola(Queue<Integer> c1, Queue<Integer> c2) {
        Queue<Integer> cola = new LinkedList<>();
        while (!c1.isEmpty() && !c2.isEmpty()) {
            cola.add(c1.poll());
            cola.add(c2.poll());
        }
        while (!c1.isEmpty()) {
            cola.add(c1.poll());
        }
        while (!c2.isEmpty()) {
            cola.add(c2.poll());
        }
        return cola;
    }

    /**
     * Imprime por pantalla una cola de elementos
     *
     * @param cola
     */
    public static void mostrarCola(Queue<Integer> cola) {
        for (Integer i : cola) {
            System.out.print(i + " ");
        }
    }

}
