package org.example.exercise9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StringFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            n = scanner.nextInt();
            scanner.nextLine();
            if(n>0){
                List<String> arr = new ArrayList<>();
                inputStringInArr(arr,n,scanner);
                String filter = scanner.nextLine();
                outputFindFilter(arr,filter);
            }

        }catch (InputMismatchException e){
            System.out.println("input error");
        }
    }

    static void inputStringInArr(List<String> arr, int n,Scanner scanner){
        while (n>0){
            arr.add(scanner.nextLine());
            n--;
        }
    }
    static void outputFindFilter(List<String> arr, String filter){
        List<String> resArr = new ArrayList<>();
        for (String string: arr){
            if (string.contains(filter)){
                resArr.add(string);
            }
        }
        String res = String.join(", ", resArr);
        System.out.println(res);
    }

}
