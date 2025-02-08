package org.example.exercise7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class WorkWithFile {
    public static void main(String[] args) throws IOException {
        Scanner filePathScanner = new Scanner(System.in);
        String fileName = filePathScanner.nextLine();
        filePathScanner.close();
        String path = "/home/kostya-skorik/ProjectSchool/JavaProject01/Project1/src/main/java/org/example/exercise7/" + fileName;
        File file = new File(path);
        try {
            Scanner Reader = new Scanner(file);
            int n = Reader.nextInt();
            double[] arr = new double[n];
            int get_count = inputArrayFromFile(arr,n,Reader);
            if (n<=0){
                System.out.println("Input error. Size <= 0");
            }
            else if (get_count<n){
                System.out.println("Input error. Insufficient number of elements");
            }
            else {
                System.out.println(get_count);
                System.out.println(outputArr(arr,n));
                writeInFile(arr,"result.txt");
                System.out.println("Saving min and max values in file");
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input error. File isn't exist");
        }
    }

     static int inputArrayFromFile(double[] arr,int n, Scanner Reader) {
        int get_count=0;
         for (int i = 0; Reader.hasNext() && i < n; i++){
             while (!Reader.hasNextFloat()){
                 Reader.next();
             }
             arr[i] = Reader.nextFloat();
             get_count++;
         }
         return get_count;
     }
    static String outputArr(double[] arr, int n){
        String res = "";
        for (int i = 0; i < n; i++){
            res = res + arr[i] + " ";
        }
        return res.trim();
    }
    static void writeInFile(double[] arr, String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("/home/kostya-skorik/ProjectSchool/JavaProject01/Project1/src/main/java/org/example/exercise7/" + fileName, "UTF-8");
        writer.print(Arrays.stream(arr).min().getAsDouble()+" ");
        writer.print(Arrays.stream(arr).max().getAsDouble());
        writer.close();
    }
}
