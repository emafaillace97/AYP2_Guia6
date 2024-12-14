package usandopilascolas;

import java.util.Stack;

public class Ejercicio4 {

    /**
     * Verifica si una cadena de simbolos esta balanceada, es decir, a cada simbolo de apertura le corresponde de manera adyacente su opuesta.
     * Por ejemplo: a '[' le debe seguir el simbolo ']'
     *
     * @param simbolos
     * @return
     */
    public static boolean estaBalanceado(String simbolos) {
        Stack<Character> pila = new Stack<>();
        for (Character c : simbolos.toCharArray()) {
            if (pila.isEmpty() || esDeApertura(c)) {
                pila.push(c);
            } else {
                if (pila.peek() == '(' && c == ')' || pila.peek() == '[' && c == ']' || pila.peek() == '{' && c == '}') {
                    pila.pop();
                }
            }
        }
        return pila.isEmpty();
    }

    private static boolean esDeApertura(char c) {
        return c == '{' || c == '(' || c == '[';
    }
}
