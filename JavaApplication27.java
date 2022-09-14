/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author M&M
 */
public class JavaApplication27 {

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
    int fact=1, num, cont=1;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escriba un numero: ");
    num = entrada.nextInt();
    do  {
          fact = fact*cont;
          cont = cont+1;
    } while (cont<=num);
    System.out.println("El factorial es: "+fact);
  }
}