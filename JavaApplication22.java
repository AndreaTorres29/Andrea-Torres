/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author M&M
 */
public class JavaApplication22 {

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
    Scanner teclado = new Scanner(System.in);
    int num;
    int supar=0;
    int suimpar=0;
    System.out.println ("Escribe un numero");
    num = teclado.nextInt();
    for(int ind=1;ind<=num;ind++) {
      if(ind%2==0){
        supar+=ind;
      }
      else {
        suimpar+=ind;
      }
    }
    System.out.println("La suma de los numeros pares es "+supar);
    System.out.println("La suma de los numeros impares es "+suimpar);
  }
}
    