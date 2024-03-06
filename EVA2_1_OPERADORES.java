/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author andyl
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMÉTICOS:
        //SUMA +, RESTA -, MULTIPLICACÓN *, DIVISIÓN /
        int num1, num2;
        num1 =5;
        num2 =3;
        int suma= num1 + num2; //operador de suma +
        //Si en el operador + uno de los términos es
        //una cadena, todo se convierte a cadena y se unen
        //concatenacón: unión de cadenas de texto
        System.out.println("La suma es " +suma);
        boolean prueba = true;
        System.out.println("El valor de prueba es" + prueba);
        ///MULTIPLICACIÓN *
        int multi;
        multi = num1 * num2;
        System.out.println ("La multiplicaciíon es" + multi);
        //DIVISÓN /
        int divi = num1 / num2;
        System.out.println("La división de 5 / 3 es " + divi);
        double diviDouble = 7 / 2.0;
        System.out.println("La divisón (double) de 7 / 2 es " + diviDouble);
        //ACUMULADORES
        //SUMA +=, RESTA -=, MULTI *=, DIVI /=
        int sumatoria = 0;
        /*sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria +80;*/
        sumatoria += 90;
        sumatoria +=80;
        sumatoria +=80;
        System.out.println("La sumatoria es" + sumatoria);
        sumatoria -= 70;//le resto 70 a sumatria
        //sumatoria = sumatoria - 70;
        System.out.println("La sumatoria es" + sumatoria);
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("Multiacum = " + multiAcum);
        multiAcum *= 5;
        System.out.println ("Multiacum = " + multiAcum);
        
       
    }
    
}
