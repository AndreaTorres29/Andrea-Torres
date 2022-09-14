/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author M&M
 */
public class JavaApplication24 {

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
    Scanner objetoNum = new Scanner(System.in);
    Scanner objetoTexto = new Scanner (System.in);

  String seguir="s";
  double num,suma;
  int conteo = 0, primo = 0, noprimo = 0;

  while ("s".equals(seguir) || "S".equals(seguir))
    {
      System.out.println("Escriba un numero positivo");
    num=objetoNum.nextInt();

    while(num<0)
    {
      System.out.println("Escriba un numero positivo");
      num=objetoNum.nextInt();
    }
    conteo++;

    if(num%2==0)
    {
        primo++;
    }
    else
    {
        noprimo++;
    }
    System.out.println("Si quiere ingresar otro valor, dijite s");
      seguir=objetoTexto.next();
    
    }
  }
}