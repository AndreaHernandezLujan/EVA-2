

package eva2_26_break;

import java.util.Scanner;


public class EVA2_26_BREAK {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A GENERAR UN ACCESO POR USUARIO Y CONTRASEÑA
        String usuario, pwd;
        
        
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner captu = new Scanner (System.in);
        //como es un control de acceso, debemos preguntar un
        //numero indeterminado de veces, hasta que el usuario
        //y contraseña sean correctos.
        while(true){
            
             usuario = captu.nextLine();
             System.out.println("Usuario");
              usuario = captu.nextLine();
             System.out.println("Contraseña");
             pwd = captu.nextLine();
             if(usuario.equals(USUARIO)&& pwd.equals(PASSWORD))//usuario
                 break;
    }
    System.out.println("Bienvenido al SISTEMA!!");
}
}
