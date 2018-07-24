/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise28;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class Exercise28 {

    /**
     * @param args the command line arguments
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
        int dec_num;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();
		
        dec_num = hex_to_decimal(hexdec_num);
		
        System.out.print("Equivalent decimal number is: " + dec_num+"\n");
    }

    private static int hex_to_decimal(String hexdec_num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
