/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author M&M
 */
public class JavaApplication25 {

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
    Scanner Entrada = new Scanner(System.in);
    int i = 0;
    while (true) {
      i++;
      System.out.println ("el valor de i es: " +i);
      if (i==10) { break;}
    }
  }
}