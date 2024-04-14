
package eva2_20_for_3_;

import java.util.Scanner;

public class EVA2_20_FOR_3_ {

    
    public static void main(String[] args) {
    String mensaje;
    int cant;
    Scanner captu = new Scanner(System.in);
    System.out.println ("¿Cual es el mensaje que quieres transmitir?");
    mensaje = captu.nextLine();
    System.out.println("¿Cuantas veces se va a imprimir el mensaje?");
    cant = captu.nextInt();
    
    for (int i = 1; i <= cant; i++) {
      System.out.println(mensaje);  
    }
    System.out.println("");
    //IMPRIMIR LA SUMATORIA DE UN NUMERO;
    //Solicitar numero entero, calcular la sumatoria. Ejemplo;
    //El usuraio introduce un 5, calcular;
    // 1 + 2 + 3 + 4 + 5
    int NE;
    int suma = 0;
    
    System.out.println("Introduce un numero entero");
    NE = captu.nextInt();
    
    for (int i = 1; i <= NE; i++) {
        suma += i;
        }
        System.out.println("La sumatoria del 1 al " + NE + "es;" + suma);
        //CAPTURAR UN NUMERO E IMPRIMIR UNA SECUENCIA DE *. EJEMPLO:
        //*, **,***
        System.out.println("");
        int N3;
        
        Scanner scanner = new Scanner (System.in);
        //Capturar el numero ingresado por el usuario
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        
        //Imprimir la secuencia de asteriscos
        for(int i = 1; i <= numero; i++) {
            for(int j = 1; j <= i; j ++) {
                System.out.println("*");
            }
            System.out.println ("");
        }
        for (int i = numero; i >=1; i--){
            for (int j = 1; j <=1; j ++){
                System.out.print("*");
            } 
            System.out.println("");
            
            
            
        }
        
    }
}

    
    
    
    
    
       
        
    
    

