package org.example.exercise8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        try {
            x = scanner.nextInt();
            int i = 1;
            while (scanner.hasNext()){
                try {
                    int y = scanner.nextInt();
                    if (y>x){
                        i++;
                        x = y;
                    }else{
                        System.out.println("The sequence is not ordered from the ordinal number of the number " + i);
                        break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("The sequence is ordered in ascending order");
                    break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }


    }
}
