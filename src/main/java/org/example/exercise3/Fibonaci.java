package org.example.exercise3;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int n = intInput();
        try {
            int x = fibonaci(n);
            System.out.println("res "+x);
        }catch (StackOverflowError e){
            System.out.println("Too large n");
        }
    }

    public static int intInput(){
        Scanner scanner = new Scanner(System.in);
        int x;

        while (!scanner.hasNextInt()){
            System.out.println("Couldn't parse a number. Please, try again");
            scanner.next();
        }
        x = scanner.nextInt();
        return x;
    }

    public static int fibonaci(int n){
        if (n<2){
            return n;
        }
        return fibonaci(n-2)+fibonaci(n-1);
    }
}
