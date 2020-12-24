package com.alevel.lesson04;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.print("enter any integer from 1 to 10: ");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for( int i = 0; i < 10; i++){
            array[i] = scan.nextInt();
        }


        System.out.println("Do u want to find the max or min element of the entered sequence?");
        Scanner scan1 = new Scanner(System.in);
        String question = scan1.nextLine();
        String answer1 = "max";
        String answer2 = "min";
        if (question.indexOf(answer1) != -1) {
            System.out.println(getMax(array));
        }else {
            System.out.println(getMin(array));
        }


    }



    public static int getMin(int... array){


        int min = array[0];
        for( int i = 0; i< array.length; i++){
            if(min> array[i]){
                min = array[i];
            }
        }
        return min;
    }


    public static int getMax(int... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }
        return max;


    }

}