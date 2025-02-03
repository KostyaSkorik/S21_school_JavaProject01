package org.example.exercise2;

import java.util.Scanner;

public class ConverterFromSec {
    public static void main(String[] args) {
        int sec = intInput();
        output(sec);
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
    public static String converter(int sec){
        int h = 0;
        int m = 0;
        int s = 0;
        String res = "";
        int temp = (sec / 60);
        if (temp >= 60){
            h = (temp/60);
        }else {
            m = temp;
        }
        s = sec - (h * 60* 60) - (m*60);

        if (h < 10) {
            res = res + "0";
        }
        res = res + h + ":";

        if (m < 10){
            res = res + "0";
        }
        res = res + m + ":";

        if (s < 10){
            res = res + "0";
        }
        res = res + s;

        return res;
    }

    public static void output(int sec){
        if (sec<0){
            System.out.println("Incorrect time");
        }else {
            System.out.println(converter(sec));
        }

    }
}
