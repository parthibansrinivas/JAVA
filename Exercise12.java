/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1= input.nextInt();
        System.out.print("Enter n2:");
        int n2= input.nextInt();
        System.out.print("Enter n3:");
        int n3= input.nextInt();
        System.out.println("the avg of 3 nos is..."+(n1+n2+n3)/3);
                
        
    }
    
}
