/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise29;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise29 {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static int main(String[] args) {
        String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    public static void main(String args[])
    {
        String hexdec_num;
        int dec_num, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdec_num = scan.nextLine();
        
        /* convert hexadecimal to decimal */        
        dec_num = hex_to_decimal(hexdec_num);
        
        /* convert decimal to binary */        
        while(dec_num != 0)
        {
            bin_num[i++] = dec_num%2;
            dec_num = dec_num/2;
        }
		
        System.out.print("Equivalent Binary Number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }

    private static int hex_to_decimal(String hexdec_num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
