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
public class ClaseNivel3 {

    public static void algoritmo11() {
        // Variables
        int[] numeros = new int[12];
        int valorBuscado = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite el valor que desea buscar"));
        int contador = 0;
        int i;


        // Lectura de datos
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":")
            );
        }
        // Conteo de frecuencia
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                contador++;
            }
        }
        // Mostrar resultado
        JOptionPane.showMessageDialog(null,
                "El valor " + valorBuscado + " aparece " + contador + " veces en el arreglo.");
    }

    public static void algoritmo12() {
        JOptionPane.showMessageDialog(null, "Tengo duda de cómo hacerlo, pensaba preguntarle en clase, perdón :((");
        //tengo duda de cómo hacerlo
    }
}
