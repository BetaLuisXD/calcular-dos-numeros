/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aqui se empieza
        System.out.println("Calculadora");
        System.out.println("CALCULAR 2 NUMEROS ENTEROS");
        System.out.println("Calculadora");
        
        
        
        //creacion scaner
        Scanner input = new Scanner (System.in);
        //int variable = input.nextInt();
        
        //creacion varaible para el primer numero
        int variable1 = 0;
        //creacion varaible2
        int variable2 = 0;
        //variable para el resultado
        int resultado =0;
        //variable para guardar la opcion del menu
        int opcion=0;
        
        //se imprime el menur y sus opciones
        System.out.println("MENU");
        System.out.println("Escoja 1,2,3,4 o 5 seun corresponda");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. dividir");
        System.out.println("4. multiplicar");
        System.out.println("5. salir");
        
        //guardo opcion
        opcion = input.nextInt();
        
        if (opcion == 1 || opcion == 2 || opcion == 3 || opcion==4){
        
        //Se solicitan los valor de los numeros a operar
        System.out.println("ingrese numero 1");
        variable1 = input.nextInt();
        System.out.println("ingrese numero 2");
        variable2 = input.nextInt();
        
      }
       
       
        
        
        
        
        //creacion switch
        switch ( opcion){
            
            case 1:
                System.out.println("esta es la opcion suma");
                resultado = variable1 + variable2;
                System.out.println("el resultado de la suma es:" +resultado);
                break;
            case 2:
                System.out.println("esta es la opcion resta");
                resultado = variable1 - variable2;
                System.out.println("el resultado de la resta es:"+resultado);
                break;
            case 3:
                System.out.println("esta es la opcion division");
                resultado = variable1 / variable2;
                System.out.println("el resultado de la division es:" +resultado);
                break;
            case 4:
                System.out.println("esta es la opcion multiplicacion");
                resultado = variable1 * variable2;
                System.out.println("el resultado de la multiplicacion es:" +resultado);
                break;
            case 5:
                System.out.println("opcion salir");
                System.out.println("gracias por utilizar la calculadora");
                break;
            default:
                System.out.println("opcion por defecto");
                System.out.println("ingrese una opcion valida");
                break;
                
        }
        /*switch (variable){
            case 1:
                System.out.println("esta es la opcion suma");
                break;
            case 2:
                System.out.println("esta es la opcion resta");
                break;
            case 3:
                System.out.println("esta es la opcion dividir");
                break;
            case 4:
                System.out.println("esta es la opcion multiplicar");
            default:
                System.out.println("opcion por defecto");
                break;
                
        }*/
        
    }
    
}
