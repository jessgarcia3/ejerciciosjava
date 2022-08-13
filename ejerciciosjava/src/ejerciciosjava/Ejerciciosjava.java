/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejerciciosjava {

    public static void main(String[] args) {
     Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion;

    while(!salir){
      System.out.println("---------------------");
      System.out.println("1. Número menor");
      System.out.println("2. Caracter de enmedio");
      System.out.println("3. Resultado total de vocales");
      System.out.println("4. password");
      System.out.println("5. Promedio array");
      System.out.println("6. Valor máximo y minimo array");
      System.out.println("7. Salir");

      try{
        System.out.println("Escribe una de las opciones: ");
        opcion = sn.nextInt();

        switch (opcion){
          case 1:
            menor obj=new menor();
            obj.menor();
            break;
          case 2:
            enmedio obj5=new enmedio();
            obj5.enmedio();
            break;
          case 3:
            vocales obj1= new vocales();
            obj1.vocales();
            break;
          case 4:
            contrasenia obj2= new contrasenia();
            obj2.contrasenia();
            break;
          case 5:
            promedio obj3 = new promedio();
            obj3.promedio();
            break;
          case 6:
            maxmin obj4 = new maxmin();
            obj4.maxmin();
            break;
          case 7:
            salir=true;
            break;
          default:
            System.out.println("Solo números entre 1 y 7");
        }
      } catch (InputMismatchException e){
        System.out.println("Debes insertar un número");
        sn.next();
      }
  }
    }
    
}
