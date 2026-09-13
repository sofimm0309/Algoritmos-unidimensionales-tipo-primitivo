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
public class Menu {

    public void mostrarMenu() {

        //Variable de opción
        int opcion = 0;

//do-while para correr el menú
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== MENÚ PRINCIPAL ===\n"
                    + "1. Nivel 1 - Fundamentos\n"
                    + "2. Nivel 2 - Recorridos y acumulación\n"
                    + "3. Nivel 3 - Búsqueda, extremos y condiciones\n"
                    + "4. Nivel 4 - Transformación de arreglos\n"
                    + "5. Nivel 5 - Integración y retos\n"
                    + "6. Salir\n"
                    + "Digite una opción:"
            ));

            //Switch para usar opciones
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Algoritmo 1");
                    ClaseNivel1.algoritmo1();
                 
                    JOptionPane.showMessageDialog(null, "Algoritmo 2");
                    ClaseNivel1.algoritmo2();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Algoritmo 5");
                    ClaseNivel2.algoritmo5();
                    JOptionPane.showMessageDialog(null, "Algoritmo 6");
                    ClaseNivel2.algoritmo6();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Algoritmo 11");
                    ClaseNivel3.algoritmo11();
                    JOptionPane.showMessageDialog(null, "Algoritmo 12");
                    ClaseNivel3.algoritmo12();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Algoritmo 15");
                    ClaseNivel4.algoritmo15();
                    JOptionPane.showMessageDialog(null, "Algoritmo 16");
                    ClaseNivel4.algoritmo16();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Algoritmo 19");
                    ClaseNivel5.algoritmo19();
                    JOptionPane.showMessageDialog(null, "Algoritmo 20");
                    ClaseNivel5.algoritmo20();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú, ¡adiós!...");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "¡Ups! Opción inválida, por favor intente otra vez");

            }

        } while (opcion != 6);

    }
}
