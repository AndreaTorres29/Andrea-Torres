/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author M&M
 */
public class JavaApplication28 {

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
    Scanner  datos= new Scanner(System.in);
    int valor;
    do {
          System.out.print("Escriba un numero entre 0 y 999 (0 termina):");
          valor=datos.nextInt();
          if(valor>=100) {
            System.out.println("Es un numero de tres digitos.");
          } else {
              if (valor>=10) {
                  System.out.println("Es un numero de dos digitos.");
              } else {
                  System.out.println("Es un numero de un digito.");
              }
            }
    } while (valor!=0);
  }
}