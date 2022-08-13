/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

class enmedio{
  public enmedio(){
  }
  public static void enmedio() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    String str = sc.nextLine();
    System.out.print("El caracter de enmedio es: "+middle(str));
  }
  public static String middle(String str){
    int posicion;
    int length;
    if (str.length()%2==0)
    {
      posicion=str.length()/2-1;
      length =2;
    } 
    else
    {
      posicion = str.length()/2;
      length=1;
    }
    return str.substring(posicion, posicion + length);
  }
  
}
