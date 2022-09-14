/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author M&M
 */
public class JavaApplication20 {

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
    int suma = 0;
    for (int i=100; i<=200; i++){
      suma = suma + i; 
    }
    System.out.println("El resultado de la suma es: " + suma);
  }
}