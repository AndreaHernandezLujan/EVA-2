/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_10_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        double moneda;
        int adivinar;
        Scanner captu = new Scanner (System.in);
        System.out.println("cara (0) o curz(1)?");
        adivinar = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("El valor de moneda = " + moneda);
        
        //0.5 es la mitad del rango, > 0,5 CARA, MENOR ES CRUZ
        if(moneda> 0.5 && adivinar == 0)
            System.out.println("Adivinaste, es cara!!");
         else
            if(moneda <= 0.5 && adivinar == 1)
             System.out.println("Adivinaste, es cruz!!");
        else
               System.out.println("Perdiste!!"); 
        
    }
}
