/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_bisiesto_1;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_17_BISIESTO_1 {

    public static void main(String[] args) {
        int Año;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce el año");
        
        Año = captu.nextInt ();
        
        if(Año %100 != 0)
            if(Año %4 ==0)
                System.out.println("Bisiesto");
        else
                System.out.println("No Bisiesto");
        else if (Año % 400 == 0)
             System.out.println("Bisiesto");
        else
            System.out.println("No Bisiesto");
    }
}
