
package eva2_24_adivinar_while;

import java.util.Scanner;


public class EVA2_24_ADIVINAR_WHILE {

    public static void main(String[] args) {
       int numero = 5;// numero que tiene que adivinar (entre 1 y 10)
       int valor = 0; //Valor para almacenar lo que capture el usuario
       Scanner captu = new Scanner (System.in);
       while (numero !=valor){
           System.out.println ("¿Cual es el numero? (Entre 1 y 10)");
           valor = captu.nextInt();
       }
       System.out.println("ADIVINASTE");
    }
    
}
