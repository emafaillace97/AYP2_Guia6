package usandolistasiteradores.ejercicio1;

import java.util.*;

public class Ejercicio3 {

    /**
     * Se eliminar duplicados de la lista
     *
     * @param l1
     * @return
     */
    public static List<Integer> eliminarDuplicados(List<Integer> l1) {
        Set<Integer> s1 = new HashSet<>();
        for (Integer i : l1) {
            s1.add(i);
        }
        return s1.stream().toList();
    }

    /**
     * Imprime cada valor de la lista por pantalla
     *
     * @param l1
     */
    public static void listar(List<Integer> l1) {
        Iterator<Integer> i = l1.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }

}
