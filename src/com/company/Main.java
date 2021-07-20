package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Size is: ");
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];
        int[][] tmatrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {             // транспонирование
            for (int j = 0; j < size; j++) {
                tmatrix[i][j] = matrix[j][i];
                System.out.print(tmatrix[i][j] + "\t");
            }
            System.out.println();
        }
        //  int sum1 = 0;                            // сумма чётных эл-ов на гл. диагонали
        //  for (int i = 0; i < size; i++) {
        //      for (int j = 0; j < size; j++) {
        //          if (i == j && matrix[i][j] % 2 == 0) {
        //              sum1 = sum1 + matrix[i][j];
        //              }
        //          }
        //      }
        //  System.out.print(sum1 + " ");
        //  System.out.println();

        //for (int i = 0; i < size; i++) {           // нечётные эл-ты под гл. диагональю (вкл. эл-ты гл. диагонали)
        //    for (int j = 0; j < size; j++) {
        //        if (i >= j && matrix[i][j] % 2 != 0)
        //            System.out.print(matrix[i][j] + " ");
        //    }
        // }

        //int comp1 = 1;                             // произведение эл-ов какой диагонали больше
        //for (int i = 0; i < size; i++) {
        //    for (int j = 0; j < size; j++) {
        //        if (i == j) {
        //            comp1 = comp1 * matrix[i][j];
        //       }
        //    }
        //}
        //System.out.print(comp1 + " ");
        //System.out.println();
        //int comp2 = 1;
        //for (int i = 0; i < size; i++) {
        //    for (int j = 0; j < size; j++) {
        //        if (i + j == size - 1) {
        //            comp2 = comp2 * matrix[i][j];
        //        }
        //    }
        //}
        //System.out.print(comp2 + " ");
        //System.out.println();
        //        if (comp1 > comp2) {
        //            System.out.print("Произведение элементов главной диагонали больше ");
        //        }
        //        else
        //        System.out.print("Произведение элементов побочной диагонали больше ");

        //int sum2 = 0;                                      // сумма чётных эл-ов над побочной диагональю (не вкл. поб.)
        //for (int i = 0; i < size; i++) {
        //      for (int j = 0; j < size; j++) {
        //          if (i + j < size - 1 && matrix[i][j] % 2 == 0) {
        //              sum2 = sum2 + matrix[i][j];
        //              }
        //          }
        //      }
        //  System.out.print(sum2 + " ");

    }
}
