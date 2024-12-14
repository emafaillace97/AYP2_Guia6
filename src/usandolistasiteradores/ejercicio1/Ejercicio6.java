package usandolistasiteradores.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

    /**
     * Verifica si una lista es sublista de una mas grande.
     * <p>
     * PRECONDICION: ambas listas deben estar ordenadas y no tener elementos repetidos
     *
     * @param l1 Lista
     * @param l2 Sublista
     * @return
     */
    public static boolean esSublistaV1(List<Integer> l1, List<Integer> l2) {
        int posPrimerElemL2enL1 = l1.indexOf(l2.get(0));
        boolean l2mayorL1 = l1.size() < l2.size();
        boolean l1NoTieneElemL2 = l1.indexOf(l2.get(0)) == -1;
        boolean subL2excedeL1 = posPrimerElemL2enL1 + (l2.size() - 1) > l1.size();
        if (!estaOrdenado(l1) || !estaOrdenado(l2) || l2mayorL1 || l1NoTieneElemL2 || subL2excedeL1) {
            return false;
        } else {
            for (int i = 0, j = posPrimerElemL2enL1; i < l2.size() && j < (posPrimerElemL2enL1 + l2.size()); i++, j++) {
                if (!l2.get(i).equals(l1.get(j))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean estaOrdenado(List<Integer> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) > l.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        //l1.add(3);
        //l1.add(4);
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        //l2.add(4);
        System.out.println(esSublistaV1(l1, l2));
    }
}
