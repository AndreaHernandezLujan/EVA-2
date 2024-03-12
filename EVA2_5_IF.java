/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_5_IF {

    public static void main(String[] args) {
       //CAPTURAR TEMPERATURA
       int temp;
       Scanner captu = new Scanner(System.in);
       //CAPTURAR TEMPERATURA
        System.out.println("Temperatura (c):");
        temp = captu.nextInt();
       
       //VAMOS A EVALUAR
       //Si la temperatura es mayor a 22º, se enciende el
       //clima
       if(temp > 22)
           System.out.println("Encender EL AIRE");
    }
}
