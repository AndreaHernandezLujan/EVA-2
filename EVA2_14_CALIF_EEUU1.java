
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andyl
 */
public class EVA2_14_CALIF_EEUU1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificacion de 0 a 100");
        cali = captu.nextInt ();
        
        if (cali >= 90 && cali <=100)
            System.out.println("A");
         if (cali >= 80 && cali <=89)
             System.out.println("B");
         if (cali >= 70 && cali <=79)
             System.out.println("C");
         if (cali >= 60 && cali <=69)
             System.out.println("D");
         if (cali >= 0 && cali <=59)
             System.out.println("F");
         else
             System.out.println("Calificacion no es valida");
    }
    
    
}
