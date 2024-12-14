package usandopilascolas;

import java.util.Stack;

public class Ejercicio5 {

    public static int evaluarRPN(String expresion) throws IllegalArgumentException {
        // Dividir la expresión en tokens
        String[] tokens = expresion.split("\\s+");
        Stack<Integer> pila = new Stack<>();

        // Recorrer cada token
        for (String token : tokens) {
            if (esNumero(token)) {
                // Si es un número, agregarlo a la pila
                pila.push(Integer.parseInt(token));
            } else if (esOperador(token)) {
                // Si es un operador, procesar la operación
                if (pila.size() < 2) {
                    throw new IllegalArgumentException("Expresión mal formada: no hay suficientes operandos.");
                }
                int b = pila.pop();
                int a = pila.pop();
                pila.push(evaluarOperacion(a, b, token));
            } else {
                throw new IllegalArgumentException("Token inválido en la expresión: " + token);
            }
        }

        // Al final, la pila debe tener exactamente un elemento (el resultado)
        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión mal formada: sobran operandos u operadores.");
        }

        return pila.pop();
    }

    private static boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean esOperador(String token) {
        return "+-*/".contains(token);
    }

    private static int evaluarOperacion(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División por cero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador no reconocido: " + operador);
        }
    }
}
