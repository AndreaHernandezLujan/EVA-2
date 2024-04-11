
package eva2_19_for_2;

import java.util.Scanner;


public class EVA2_19_FOR_2 {

    
    public static void main(String[] args) {
        //PREGUNTAR: CANTIDAD DE ESTUDIANTES EN EL GRUPO
        int numAlum;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        numAlum = captu.nextInt();
        //hay que capturar todas las calificaciones:
        //for (int i = 0; i < numAlum; i++ { AMBOS FOR HACEN LO MISMO
        for (int i = 1; i <= numAlum; i++) {
            System.out.println("Calificacion");
            int califa = captu.nextInt();
            
        }
    }
    
}
