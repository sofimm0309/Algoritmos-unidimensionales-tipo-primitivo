/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 */
public class ClaseNivel4 {

    public static void algoritmo15() {
        // Variables
        int[] numeros = {1, 2, 3, 4, 5}; // ejemplo inicial
        int ultimo = numeros[numeros.length - 1]; // guardar el último

        // Rotación a la derecha
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;

        // Mostrar resultado
        String resultado = "Arreglo rotado: ";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void algoritmo16() {
        JOptionPane.showMessageDialog(null, "Tengo duda de cómo hacerlo, pensaba preguntarle en clase, perdón :((");
        //tengo duda de cómo hacerlo
    }
}
