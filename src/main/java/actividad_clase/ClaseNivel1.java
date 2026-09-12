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
public class ClaseNivel1 {

    //---------------------------Algoritmos Sofía---------------------------------
    //-----Algoritmo 1
    public static void algoritmo1() {
        //variables
        double[] numeros = {1.2, 2.3, 4.5, 6.7};
        //salidas
        JOptionPane.showMessageDialog(null, "Algoritmo 1\n"
                + "\nLongitud del arreglo: " + numeros.length
                + "\nÚltimo elemento: " + numeros[numeros.length - 1]);

    }

    public static void algoritmo2() {
        boolean[] valores = {true, false, true, true, false, false};
        for (int i = 0; i < valores.length; i++) {

            JOptionPane.showMessageDialog(null, "Algoritmo 2\n"
                                                + "Posición " + i + ": " + valores[i]);

        }

    }
}
