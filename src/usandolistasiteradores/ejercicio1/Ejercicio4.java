package usandolistasiteradores.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    /**
     * Se obtiene la lista inversa de otra
     *
     * @param l1
     * @return
     */
    public static List<Integer> getInverso(List<Integer> l1) {
        List<Integer> inverso = new ArrayList<>();
        for (int i = l1.size() - 1; i >= 0; i--) {
            inverso.add(l1.get(i));
        }
        return inverso;
    }

}
