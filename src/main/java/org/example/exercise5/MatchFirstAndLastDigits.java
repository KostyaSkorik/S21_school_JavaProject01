package org.example.exercise5;

import java.util.Scanner;

public class MatchFirstAndLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (!scanner.hasNextInt()){
            System.out.println("Couldn't parse a number. Please, try again");
            scanner.next();
        }
        n = scanner.nextInt();
        if(n>0){
            int[] arr = inputStartArr(n,scanner);
            int countElement = countNumOfElem(arr,n);
            if (countElement>0){
                System.out.println(outputArr(resultArr(arr,n,countElement),countElement));
            }else {
                System.out.println("There are no such elements");
            }

        }else {
            System.out.println("Input error. Size <= 0");
        }

    }

    static boolean isSameFirstAndLastDigits(int x){
        int firstDigits = x%10;
        int lastDigits = x;
        while (lastDigits>=9){
            lastDigits/=10;
        }
        return firstDigits == lastDigits;
    }
    static int[] inputStartArr(int n,Scanner scanner){
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            while (!scanner.hasNextInt()){
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.next();
            }
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    static int countNumOfElem(int[] arr, int n){
        int c = 0;
        for (int i = 0; i < n; i++){
            if(isSameFirstAndLastDigits(arr[i])){
                c+=1;
            }
        }
        return c;
    }
    static int[] resultArr(int[]arr,int n,int c){
        int[] resultArr = new int[c];
        int i,j;
        for (i = 0, j = 0; i<n; i++){
            if(isSameFirstAndLastDigits(arr[i])){
                resultArr[j++] = arr[i];
            }
        }
        return resultArr;
    }
    static String outputArr(int[] arr, int n){
        String res = "";
        for (int i = 0; i < n; i++){
            res = res + arr[i] + " ";
        }
        return res.trim();
    }
}
