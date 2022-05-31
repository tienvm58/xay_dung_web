/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponha;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println(" mời bạn nhập a: ");
         a = sc.nextInt();
         System.out.println(" mời bạn nhập b: ");
         b = sc.nextInt();
         
         System.out.println("a + b =" +(a+b));
         System.out.println("a - b =" +(a-b));
         System.out.println("a * b =" +(a*b));
         System.out.println("a ^ b =" +Math.pow(a,b));
    }
    
}
