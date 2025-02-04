package org.example.exercise6;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (!scanner.hasNextInt()){
            System.out.println("Couldn't parse a number. Please, try again");
            scanner.next();
        }
        n = scanner.nextInt();
        if (n>0){
            double[] arr = createInputArray(n,scanner);
            selectionSort(arr,n);
            System.out.println(outputArr(arr,n));
        }else {
            System.out.println("Input error. Size <= 0");
        }

    }
    static void selectionSort(double[] arr, int n){
        for (int i = 0; i < n - 1; i++){
            int min_ind = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            if (min_ind!=i){
                double temp = arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i] = temp;
            }
        }
    }

    static double[] createInputArray(int n,Scanner scanner){
        double[] arr = new double[n];
        for (int i = 0; i<n; i++){
            while (!scanner.hasNextFloat()){
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.next();
            }
            arr[i] = scanner.nextFloat();
        }
        return arr;
    }
    static String outputArr(double[] arr, int n){
        String res = "";
        for (int i = 0; i < n; i++){
            res = res + arr[i] + " ";
        }
        return res.trim();
    }
}
