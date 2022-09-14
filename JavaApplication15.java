/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author M&M
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nombre, clave;
    Scanner Entrada = new Scanner(System.in);
    System.out.print("Escriba el nombre de usuario: ");
    nombre = Entrada.nextLine();
    System.out.print("Escriba la clave de usuario: ");
    clave = Entrada.nextLine();
    if(nombre.equals("Andre") && clave.equals("2005")){
      System.out.println("Bienvenido!");
    }
    else{
    System.out.println("El nombre o la contraseña es incorrecta");
   }
  
    }
    
}

  
   
 