package usandolistasiteradores.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Ejercicio5 {

    /**
     * Verifica si en una lista existe elementos que son el resultado de la suma de otros
     *
     * @param l1
     * @return
     */
    public static boolean existeSuma(List<Integer> l1) {
        int a, b;
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l1.size(); j++) {
                a = l1.get(i);
                b = l1.get(j);
                if (l1.contains(a + b)) {
                    return true;
                }
            }
        }
        return false;
    }

}
