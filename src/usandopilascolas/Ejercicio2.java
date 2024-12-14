package usandopilascolas;

public class Ejercicio2 {

    /**
     * Verifica si una palabra es palindromo/capicua
     *
     * @param palabra
     * @return
     */
    public static boolean esPalindromoV1(String palabra) {
        String palabraLower = palabra.toLowerCase();
        String palabraInversa = Ejercicio1.cadenaInversaV1(palabra);
        return palabraInversa.equals(palabraLower);
    }

}
