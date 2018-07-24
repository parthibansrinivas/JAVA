/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Input the first number:");
        int n1=input.nextInt();
        System.out.print("Input the second number:");
        int n2=input.nextInt();
        int sum= n1+n2;
        int prod= n1*n2;
        float diff;
        diff = (n1/n2);
        int sub= n1-n2;
        System.out.println("The Sum of 2 given nos. is:"+sum);
        System.out.println("The product of 2 given nos. is:"+prod);
        System.out.println("The Division of 2 given nos. is:"+diff);
        System.out.println("The difference of 2 given nos. is:"+sub);
        
       
        
    }
    
}
