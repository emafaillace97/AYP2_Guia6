package usandopilascolas;

import java.util.Stack;

public class Ejercicio6 {

    /**
     * Verifica si una cadena esta compuesta por una palabra, un separador y el inverso de la primera palabra
     *
     * @param cadena
     * @return
     * @throws Exception
     */
    public static boolean estaSeparado(String cadena) throws Exception {
        String nuevaCadena = cadena.replace(" ", "").toLowerCase();
        if ((nuevaCadena.length() - 1) % 2 != 0) {
            throw new Exception("El tamaño de cada palabra es distinto");
        } else {
            Stack<Character> letras = new Stack<>();
            for (Character c : nuevaCadena.toCharArray()) {
                if (c != '@') {
                    letras.add(c);
                }
            }
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            int cantLetras = letras.size();
            while (!letras.isEmpty()) {
                if (i < (cantLetras / 2)) {
                    sb1.append(letras.pop());
                    i++;
                } else {
                    sb2.append(letras.pop());
                }
            }
            return sb1.toString().equals(sb2.toString());
        }
    }

    /**
     * Verifica si una cadena esta compuesta por una palabra, un separador y el inverso de la primera palabra
     *
     * @param cadena
     * @return
     * @throws Exception
     */
    public static boolean estaSeparado2(String cadena) throws Exception {
        String nuevaCadena = cadena.toLowerCase().replace(" ", "");
        int posMedia = (nuevaCadena.length() / 2);
        if (nuevaCadena.charAt(posMedia) != '@') {
            throw new Exception("La cadena no tiene el separador '@'");
        } else {
            String c1 = nuevaCadena.substring(0, posMedia);
            String c2 = nuevaCadena.substring(posMedia + 1, nuevaCadena.length());
            return c1.equals(c2);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(estaSeparado2("emaa @ ema"));
    }
}
