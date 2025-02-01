package org.example.exercise1;

import java.util.Scanner;

public class PerimeterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] coordinates = new double[6];

        for (int i = 0; i < 6; i ++){

            while(!scanner.hasNextFloat()){
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.next();
            }
            coordinates[i] = scanner.nextFloat();
        }

        double side_1 = Math.sqrt(Math.pow((coordinates[2]-coordinates[0]),2.0) + Math.pow((coordinates[3]-coordinates[1]),2.0));
        double side_2 = Math.sqrt(Math.pow((coordinates[4]-coordinates[0]),2.0) + Math.pow((coordinates[5]-coordinates[1]),2.0));
        double side_3 = Math.sqrt(Math.pow((coordinates[4]-coordinates[2]),2.0) + Math.pow((coordinates[5]-coordinates[3]),2.0));

        if (triangleIsExist(side_1,side_2,side_3)){
            double res = side_1 + side_2 + side_3;
            System.out.printf("Res = %.3f", res);
        }else {
            System.out.println("It isn't triangle");
        }


    }
    static boolean triangleIsExist(double a, double b, double c){
        return ((a + b) > c) && ((a + c) > b) && ((b + c) > b);
    }
}
