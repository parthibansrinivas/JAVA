/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int rad= input.nextInt();
        float peri;
        peri = (float) (2*(3.14)*rad);
        float area;
        area = (float) ((3.14)*rad*rad);
        System.out.println("The Perimeter of the given circle is :"+peri);
        System.out.println("The Area of the circle is :"+area);
        
    }
    
}
