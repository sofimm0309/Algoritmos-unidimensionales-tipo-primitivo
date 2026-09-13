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
public class ClaseNivel2 {
    //---------------------------Algoritmos Sofía---------------------------------

    public static void algoritmo5() {
        //variables
        double[] numeros = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9};
        double promedio;
        double suma = 0;
        int i;

        //datos
        for (i = 0; i < numeros.length; i++) {
            suma += numeros[i];

        }
        //cálculo de promedio
        promedio = suma / numeros.length;
        //mostrar el promedio finalString.format

        JOptionPane.showMessageDialog(null,
                String.format("El promedio general es: %.2f", promedio));
    }

    public static void algoritmo6() {
        // Variables
        boolean[] asistencia = new boolean[20]; // true = asistió, false = faltó
        int asistieron = 0;
        int faltaron = 0;
        double porcentaje;
        int i;

        // Datos: ingresar asistencia (1 = asistió, 0 = faltó)
        for (i = 0; i < asistencia.length; i++) {
            int valor = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese 1 si asistió, 0 si faltó (persona " + (i + 1) + "):")
            );

            asistencia[i] = (valor == 1);

        }

        // Conteo
        for (i = 0; i < asistencia.length; i++) {
            if (asistencia[i]) {
                asistieron++;
            } else {
                faltaron++;
            }
        }
        // Calcular porcentaje de asistencia
        porcentaje = (asistieron * 100.0) / asistencia.length;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "Asistieron: " + asistieron
                + "\nFaltaron: " + faltaron
                + "\nPorcentaje de asistencia: " + String.format("%.2f", porcentaje) + "%");

    }

}
