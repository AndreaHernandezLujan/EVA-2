/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_9_VOLADO2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elige cara (1) o cruz (2):");
        int eleccionUsuario = scanner.nextInt();
        
        //Generar aleatoriamente cara (1) o cruz (2)
        int eleccionMaquina = (int) (Math.random() * 2) + 1;
        
        if (eleccionUsuario == eleccionMaquina) {
            if (eleccionUsuario == 1 ) {
                System.out.println("¡Has elegido cara y has ganado!");
            } else {
                System.out.println("¡Has elegido cruz y has ganado!");
            }
        } else { 
            if (eleccionUsuario == 1) {
               System.out.println("¡Has elegido cara pero has perdido!"); 
            } else {
                 System.out.println("¡Has elegido cruz pero has perdido!");
            }
        }
    }
}
