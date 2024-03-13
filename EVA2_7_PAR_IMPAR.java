/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_7_PAR_IMPAR {

    public static void main(String[] args) {
    int num, divi, resi;
    Scanner captu = new Scanner (System.in);
    System.out.println("Introduce un numero entero");
    num = captu.nextInt();
    divi = num / 2;
    System.out.println ("Division entera de " + num + " / 2" + divi);
    resi = num % 2;
    System.out.println ("El residuo de " + num + " % 2" + resi);
    //Numero par o impar:
    if(resi == 1)
        System.out.println (num + " es impar");
    else
        System.out.println(num + " es par");
    
          
    }
}
