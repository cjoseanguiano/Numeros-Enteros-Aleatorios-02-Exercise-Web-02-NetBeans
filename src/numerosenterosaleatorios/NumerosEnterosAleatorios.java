/*
Crea una aplicación que nos genere una cantidad de números enteros aleatorios 
que nosotros le pasaremos por teclado. 
Crea un método donde pasamos como parámetros entre que números queremos que los genere,
podemos pedirlas por teclado antes de generar los números. 
Este método devolverá un número entero aleatorio. 
Muestra estos números por pantalla.
 */
package numerosenterosaleatorios;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumerosEnterosAleatorios {

    public static void main(String[] args) {

        int cantidad_Maxima;
        int numA;
        int numB;

        cantidad_Maxima = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad Maxima"));

        numA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero A"));
        numB = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero B"));

        for (int i = 0; i < cantidad_Maxima; i++) {
            System.out.println(numerosAleatorio(numA, numB));
        }
    }

    public static int numerosAleatorio(int numeroA, int numeroB) {
        return ((int) (Math.random() * (numeroB - numeroA) + numeroA));
    }
}
