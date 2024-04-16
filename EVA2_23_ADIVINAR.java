
package eva2_23_adivinar;

import java.util.Scanner;


public class EVA2_23_ADIVINAR {

    public static void main(String[] args) {
        int numero = 5; //numero que tiene que adivinar (entre 1 y 10)
        int valor = 0; //valor para almacenar lo que capture el usuario
        
        Scanner captu = new Scanner (System.in);
        do{
            System.out.println("¿Cual es el numero?(entre 1 y 10)");
            valor = captu.nextInt();
        }while (numero != valor);
        System.out.println("Adivinaste");
    }
    
}
