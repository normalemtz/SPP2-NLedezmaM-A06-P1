/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a06.p1;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             System.out.println("La suma total es de = " + Operacion(solicitaDatos("un número positivo: ")));
       }
public static int solicitaDatos(String mensaje){
        Scanner tecl = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = tecl.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            tecl.nextLine();
            
        return varEntera;
    }     
    } while (flag); 
    return varEntera;
    }

public static int Operacion(int num){
   int suma = 0;
   while (num>=0){
       suma = suma + num;
       num = solicitaDatos("otro número positivo: ");
       if (num<0){
           System.out.println("Introdujo un número negativo!");
       }
    }
   return suma;
}
        
    }

     

