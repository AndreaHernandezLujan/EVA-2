/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_6_COMPARAR {

    public static void main(String[] args) {
     //CUAL ES EL MAYOR VALOR ENTRE DOS NUMEROS 
     //PIDAN AL USUARIO DOS VALORES ENTEROS
     int num1, num2;
     Scanner captu= new Scanner (System.in);
     System.out.println("Valor 1:2");
     num1 = captu.nextInt ();
     System.out.println("Valor 2:");
     num2 = captu.nextInt ();
     //CUAL ES EL MAYOR
     if (num1 > num2)
          System.out.println(num1 + " es mayor!!!");
     else{
         if(num1 == num2) //num1 es igual que num2?
             System.out.println("Son iguales");
         else
     
         System.out.println(num2 + " es mayor!!");
     }
    }
}
