package com.vannn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cach1();
//        cach2();
    }

    public static void cach1() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Nhập số phần tử của mảng: ");

        int k = scanner.nextInt();

        System.out.printf("Nhập %d phần tử trên cùng một dòng: ", k); // nhập k phần tử cách nhau bằng dấu cách

        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Mảng bạn vừa nhập là: ");
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] +  " ");
        }
        System.out.println();

        // todo tìm số dòng và số cột theo cách thủ công trâu bò
        int numberOfColumns = 0;
        int numberOfRows = 0;

        for (int n = 1; n <= k; n ++) {
            if (n * n >= k) {
                numberOfColumns = n;
                numberOfRows = n;
                break;
            }

            if (n * (n + 1) >= k) {
                numberOfColumns = n + 1;
                numberOfRows = n;
                break;
            }
        }

        int[][] b = new int[numberOfRows][numberOfColumns];

        for (int m = 0; m < numberOfRows; m++) {
            for (int n = 0; n < numberOfColumns; n++) {
                if (m * numberOfColumns + n < k) {
                    b[m][n] = a[m * numberOfColumns + n];
                }
            }
        }

        System.out.printf("Kết quả là mảng hai chiều có kích thước %d x %d : \n", numberOfRows, numberOfColumns);

        for (int m = 0; m < numberOfRows; m++) {
            for (int n = 0; n < numberOfColumns; n++) {
                System.out.print(b[m][n] + "\t" );
            }
            System.out.println();
        }
    }

    public static void cach2() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Nhập số phần tử của mảng: ");

        int k = scanner.nextInt();

        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        System.out.printf("Mảng tự động gồm %d phần tử là: ", k);
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] +  " ");
        }
        System.out.println();

        // todo tìm số dòng và số cột theo công thức

        int numberOfRows = (int) Math.sqrt(k);
        int numberOfColumns = 0;
        if (numberOfRows * numberOfRows == k) {
            numberOfColumns = numberOfRows;
        } else if (numberOfRows * (numberOfRows + 1) >= k) {
            numberOfColumns = numberOfRows + 1;
        } else {
            numberOfRows = numberOfRows + 1;
            numberOfColumns = numberOfRows;
        }

        int[][] b = new int[numberOfRows][numberOfColumns];

        for (int m = 0; m < numberOfRows; m++) {
            for (int n = 0; n < numberOfColumns; n++) {
                if (m * numberOfColumns + n < k) {
                    b[m][n] = a[m * numberOfColumns + n];
                }
            }
        }

        System.out.printf("Kết quả là mảng hai chiều có kích thước %d x %d : \n", numberOfRows, numberOfColumns);

        for (int m = 0; m < numberOfRows; m++) {
            for (int n = 0; n < numberOfColumns; n++) {
                System.out.print(b[m][n] + "\t" );
            }
            System.out.println();
        }
    }
}
