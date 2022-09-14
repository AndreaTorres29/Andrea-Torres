/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author M&M
 */
public class JavaApplication23 {

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
    double nota; 
    
  System.out.println("Ingrese un numero desde 1 hasta 15");
  nota=ingresar.nextDouble();

  while(nota<1 | nota>15)
  {
  System.out.println("El numero proporcionado no es correcto");
    nota=ingresar.nextDouble();
    }
  }
}