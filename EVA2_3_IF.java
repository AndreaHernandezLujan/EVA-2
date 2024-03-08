/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author andyl
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double califa;
     Scanner captu = new Scanner (System.in);
     califa = captu.nextDouble ();
     if(califa >= 70) {// esta seccion -- true
        //{} opcionales, solo cuando tenemos mas
        // de una instruccion
        System.out.println ("Aprobaste!!!");
       
    }else//la evaluacion false es opcional
       System.out.println("No acreditaste!!!");
    }
    //aqui continua el programa
}
