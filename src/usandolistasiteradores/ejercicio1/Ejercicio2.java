package usandolistasiteradores.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio2 {

    public static List<Integer> ordenar(List<Integer> l1, List<Integer> l2) throws Exception {
        if (estaOrdenado(l1) && estaOrdenado(l2)) {
            List<Integer> l3 = new ArrayList<>();
            Iterator<Integer> i1 = l1.iterator();
            Iterator<Integer> i2 = l2.iterator();
            while (i1.hasNext() && i2.hasNext()) {
                l3.add(i1.next());
                l3.add(i2.next());
            }
            while (i1.hasNext()) {
                l3.add(i1.next());
            }
            while (i2.hasNext()) {
                l3.add(i2.next());
            }
            return l3;
        } else {
            throw new Exception("La lista no esta ordenada");
        }
    }

    /**
     * Verifica si una lista esta ordenada
     *
     * @param l1
     * @return
     */
    public static boolean estaOrdenado(List<Integer> l1) {
        for (int i = 0; i < l1.size() - 1; i++) {
            if (l1.get(i) > l1.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void listar(List<Integer> l1) {
        for (Integer i : l1) {
            System.out.print(i + " ");
        }
    }

}
