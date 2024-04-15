
package prueba_asterisco;

import java.util.Scanner;

//PRUEBA DE PRACTICA HECHA EN CASA ANDREA HERNADNEZ LUJAN
public class PRUEBA_ASTERISCO {
public static void  izq(int filas){
     int i, j;
     for (i=1;i<=filas;i++){ //este es el primer for de i, (va desde i=1 hasta i menor o igual al numero de filas que tenemos. (Este for se va a encargar de los saltos de linea) 
     for (j=1; j<=i;j++){ //este es el for de j (va desde j=1 hasta j menor o igual a nuestra variable i. (Este for sera el encargado de imprimir los asteriscos)
     System.out.print("*");//Aqui se coloca un System.out pero se le quita el "ln" para que todo aparezca en una misma fila, no olvides poner los parentesis.
     }
     System.out.println(""); //Aqui si se le coloca ln para dar un salto de linea y lo dejamos con comillas vacias
     }
}
   public static void  der(int filas){
     int i, j, k;
     for (i=1;i<=filas;i++){ //este es el primer for de i, (va desde i=1 hasta i menor o igual al numero de filas que tenemos. (Este for se va a encargar de los saltos de linea) 
     for(k=1;k<= filas-i;k++){
         System.out.print(" ");//Este es el for para imprimir los espacios, se coloca un espacio entre las comillas
     }
     
         for (j=1; j<=i;j++){ //este es el for de j (va desde j=1 hasta j menor o igual a nuestra variable i. (Este for sera el encargado de imprimir los asteriscos)
     System.out.print("*");//Aqui se coloca un System.out pero se le quita el "ln" para que todo aparezca en una misma fila, no olvides poner los parentesis.
     }
     System.out.println(""); //Aqui si se le coloca ln para dar un salto de linea y lo dejamos con comillas vacias
     }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Aqui se importa la clase scanner para que el metodo main cree una instancia Scanner llamada scanner que se utliza para leer la entrada del usuario
        System.out.print("Ingrese el numero de filas para visualizar los asteriscos");//Se muestra al usuario un mensaje pidiendo el numero de filas Luego, se lee el número ingresado por el usuario utilizando scanner.nextInt()
        int filas = scanner.nextInt();
        scanner.close();
        izq(filas);
        
        System.out.print("Ingrese el numero de filas para visualizar los asteriscos");
        scanner.close();
        der(filas);
               
        }
    }
    

    
    










    

    


