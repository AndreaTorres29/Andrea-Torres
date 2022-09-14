/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author M&M
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
import java.util.Scanner;
class Main {
  public static void main(String[]args) {
    Scanner ingresar = new Scanner(System.in);
    System.out.println("Escriba un numero: ");
    int numero; 
    numero = ingresar.nextInt();
    for(int i =1; i<=10; i++){
      System.out.println(numero + " * " + i + " = " + numero * i );
    }  
  }
}  