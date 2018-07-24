/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise25;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
     long octal_num, decimal_num = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
    octal_num = in.nextLong();
    while (octal_num != 0) 
     {
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
      octal_num = octal_num / 10;
     }
    System.out.print("Equivalent decimal number: " + decimal_num+"\n");

    }
    
}
