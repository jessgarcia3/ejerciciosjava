/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;
class menor {
  public menor() {
  }
  public static void menor() {
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3;
    System.out.print("Introduzca primer número: ");
    num1 = sc.nextInt();
    System.out.print("Introduzca el segundo número: ");
    num2= sc.nextInt();
    System.out.print("Introduzca el tercer número: ");
    num3=sc.nextInt();
    
    if (num1 < num2) {
    if (num1< num3){
      System.out.println("El número menor es: " + num1);
  } else { 
      System.out.println("El número menor es: " + num3);
   }
  } else if (num2 < num3){
      System.out.println("El menor es: " + num2);
   } else {
      System.out.println("El menor es: " + num3);
    }
    }
}
