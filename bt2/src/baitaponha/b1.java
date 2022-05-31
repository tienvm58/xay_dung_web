
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaponha;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 3;
        int m = 0;
        int n = 0;
        
        int arrayM[] = new int[10];
        int arrayN[] = new int[10];
        int dem = 0;
        
        for (m = 0; m <= 10; m++) {
            for (n = 0; n <= 10; n++) {

                if (m == n && m * n >= k) {

      
                    arrayM[dem] = m;
                    arrayN[dem]= n;
                    dem ++;
                    break;
                } else if (m + 1 == n && m * n >= k) {
                    arrayM[dem] = m;
                    arrayN[dem]= n;
                    dem ++;
        
                    break;
                }
            }

        }
         
        int minM=arrayM[0];
        int minN=arrayN[0];
        
       
        for (int i = 0; i < dem; i++) {
            if(minM>arrayM[i]){
                minM=arrayM[i];
            }
            
        }
         System.out.println("so hang la " +minM);
     for (int i = 0; i < dem; i++) {
            if(minN>arrayN[i]){
                minN=arrayN[i];
            }
            
        }
        System.out.println("so cot la "+minN);
            int[][] a = new int[minM][minN];
            for (int i = 0; i < minM; i++) {
                for (int j = 0; j < minN; j++) {
                    System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                    a[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < minM; i++) {
                for (int j = 0; j < minN; j++) {
                    System.out.print(a[i][j] + "\t");
                }

                System.out.println("\n");
            }
        
    
    }

        

    

    public static void ham() {

//        Scanner sc = new Scanner(System.in);
//        System.out.println(" nhập m");
//        m = Integer.parseInt(sc.nextLine());
//        System.out.println(" nhập n");
//        n = Integer.parseInt(sc.nextLine());
//        System.out.println(" nhập k");
//        k = Integer.parseInt(sc.nextLine());
//        if (m * n >= k) {
//            System.out.println(" true m=" + m + "\tn=" + n + "\tk=" + k);
//
//        } else {
//            System.out.println("fl m=" + m + "\tn=" + n + "\tk=" + k);
//        }
//        int a[] = new int[10];
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        int b[][] = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println(b[i][j]);
//            }
//        }
//        a[1] = b[0][1];
//        a[2] = b[2][3];
//        a[3] = b[5][5];
//        a[4] = b[5][6];
//        a[5] = b[7][8];
//        a[6] = b[9][10];
//        a[7] = b[11][12];
//        a[8] = b[13][14];
//        a[9] = b[15][16];
//        a[10] = b[17][18];
//
    }

}
