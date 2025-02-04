package org.example.exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeAverage {
    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n>0){
            arr = new int[n];
            if (inputIntoArray(n,arr,scanner)){
                System.out.println(negativeAverage(arr));
            }else {
                System.out.println("There are no negative elements");
            }
        }
        else {
            System.out.println("Input error. Size <= 0");
        }



    }

    static boolean inputIntoArray(int n, int[] arr, Scanner scanner){
        int consistNegative = 0;
        for (int i = 0; i < n; i++){
            while (!scanner.hasNextInt()){
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.next();
            }
            int el = scanner.nextInt();
            if (el<0){
                consistNegative = 1;
            }
            arr[i] = el;
        }
        return consistNegative==1;
    }
    static int negativeAverage(int[] arr){
        int sum = 0;
        int len = 0;
        for (int i:arr){
            if (i<0){
                sum+=i;
                len+=1;
            }
        }
        return sum/len;
    }
}
