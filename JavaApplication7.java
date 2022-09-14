/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author M&M
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto = new Scanner(System.in);
    int numero1, numero2, contador;
    System.out.println("Escriba un numero: ");
    numero1 = objeto.nextInt();
    System.out.println("Escriba un numero");
    numero2 = objeto.nextInt();
    contador = numero1;
    while (contador > numero2){
      System.out.println(contador);
      contador--;
    }
    }
    
}
