
package eva2_25_break_cont;


public class EVA2_25_BREAK_CONT {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i= 0; i < 100; i ++){
           int mod = i % 2;
            if(mod != 0) //queremos los casos que sean pares
                continue; // CUANDO SE EJECUTA, INTERRUMPE LA INTERACION ACTUAL
            
            System.out.println(i);
        }
        System.out.println("BREAK: >>>>>>>>>>>>>>>>>");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50) 
                break; //cuando se ejecuta, detine por completo el ciclo
                   
        }
    }
    
    
    
}
