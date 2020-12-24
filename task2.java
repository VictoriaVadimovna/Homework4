package com.alevel.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("enter any integer from 1 to 10: ");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        //все что ввели преобразовуем в ячейки массива
        for( int i = 0; i < 10; i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Do u want to sort the numbers in descending or ascending order?");
        Scanner scan1 = new Scanner(System.in);
        String question = scan1.nextLine();
        String answer1 = "descending";
        String answer2 = "ascending";

        if (question.indexOf(answer1) != -1) {

            System.out.println(Arrays.toString(getSortedDescending(array)));

        } else if(question.indexOf(answer2) != -1) {

            System.out.println(Arrays.toString(getSortedaAcending(array)));
        }
    }

    public static int[] getSortedDescending (int... array){
        int swap;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                }
            }
        }
return array;


    }


   public static int[] getSortedaAcending(int... array){
        int swap;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                }
            }
        }
        return array;
    }






    }
