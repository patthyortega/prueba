/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import ejercicio4.Funcionario;
/**
 *
 * @author Usuario
 */
public class Prueba_Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Funcionario funcionario= new Funcionario("20202020-k","Fernandez Lopez","Juan","Osorno","10/10/2010",320.111);
        System.out.println(funcionario.mostrarDatos());
        
    }
    
}
