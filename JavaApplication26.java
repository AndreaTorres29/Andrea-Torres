/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author M&M
 */
public class JavaApplication26 {

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
    Scanner Reader = new Scanner(System.in);
    String quieroJugar = "si";
    while(quieroJugar.equals("si")){
    System.out.println("seguir jugando?");
      quieroJugar = Reader.next();
    }
  }
}  