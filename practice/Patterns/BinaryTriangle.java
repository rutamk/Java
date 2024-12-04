package Patterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows;i++) {
            for (int j = 1; j <= i; j++) System.out.print((i + j) % 2 != 0 ? "0 " : "1 ");
            System.out.println();
        }
    }
}