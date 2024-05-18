/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication16 {
public static double add(double num1, double num2) {
        // Student Number 1 , add your code here
       return num1 + num2 ;
          
    }
    /**
     * @param args the command line arguments
     */     

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
        double num1, num2;

         System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();
             double r1= add (num1, num2); 
 
          System.out.println( r1) ;
          
          //@Test1
       // double r1= add (-4, 5); 
       
         //@Test1
       // double r1= add (-3, -5); 
       
         //@Test1
       // double r1= add (0, 5); 

          
  //@Test1
       // double r1= add (0, 8); 
      
    }
    
}
