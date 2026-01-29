/**
 * Clase Calculadora que realiza operacións básicas.
 * 
 * @author TÚNOME
 * @version 1.0
 */
public class Calculadora {

    /**
     * Suma dous números enteiros.
     *
     * @param a o primeiro número
     * @param b o segundo número
     * @return a suma de a e b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Método principal para probar a clase.
     * 
     * @param args argumentos da liña de comandos
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma de 5 e 3: " + calc.sumar(5, 3));
    }
}
