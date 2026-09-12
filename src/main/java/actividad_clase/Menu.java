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
                + "6. Salir\n\n"
                + "Digite una opción:"
            ));

            //Switch para usar opciones
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                   JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    System.exit(0);
                default:
                   JOptionPane.showMessageDialog(null, "Opción inválida");

            }

        } while (opcion != 6);

    }
}
