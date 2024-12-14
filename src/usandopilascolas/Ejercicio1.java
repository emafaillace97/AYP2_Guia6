package usandopilascolas;

import java.util.Stack;

public class Ejercicio1 {

    /**
     * Invierte el orden de una cadena
     */
    public static String cadenaInversaV1(String cadena) {
        Stack<Character> inverso = new Stack<>();
        for (Character c : cadena.toLowerCase().toCharArray()) {
            inverso.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!inverso.empty()) {
            char letra = inverso.pop();
            sb.append(letra);
        }
        return sb.toString();
    }

    /**
     * Invierte el orden de una cadena
     */
    public static String cadenaInversaV2(String cadena) {
        StringBuilder sb = new StringBuilder();
        int cadenaLong = cadena.length();
        String cadenaLower = cadena.toLowerCase();
        for (int i = cadenaLong - 1; i >= 0; i--) {
            sb.append(cadenaLower.charAt(i));
        }
        return sb.toString();
    }
}
