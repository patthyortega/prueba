/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Usuario
 */
public class Controlador {
    
    public void Controlador() throws InterruptedException{
       Scanner entrada=new Scanner(System.in);
       Controlador controlador=new Controlador();
       int seleccion=0;
       do{
       System.out.println("::Menu::\n1)Numero de cuenta:\n2)Titular de la cuenta: \n3)Saldo de la cuenta:\n4)interes anual de la cuenta:");
       seleccion = entrada.nextInt();
       switch(seleccion){
           case 1:
               System.out.println("\nIngrese Numero:");
               int num1= entrada.nextInt();
               break;
           case 2:
               System.out.println("\nIngrese Titular:");
               
               break;
           case 3:
               System.out.println("\nIngrese Saldo");
               break;
           case 4:
               System.out.println("interes anual");
               break;
           case 0:
               System.out.println("chaolin");
           default:
               System.out.println("gracias");
               break;
       }
       TimeUnit.SECONDS.sleep(5);
       } while(seleccion!=0);
       
    }  
    
}
