/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise24;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");

    }
    
}
