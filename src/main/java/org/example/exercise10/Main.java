package org.example.exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (!scanner.hasNextInt()){
            System.out.println("Couldn't parse a number. Please, try again");
            scanner.next();
        }
        n = scanner.nextInt();
        scanner.nextLine();
        List<User> users = new ArrayList<>();
        addUserToList(users,scanner,n);
        scanner.close();
        List<User> filterUsers = users.stream().filter(user -> user.age>=18).toList();
        List<String> resultName = filterUsers.stream().map(user -> user.name).toList();
        System.out.println(String.join(", ", resultName));

    }
    static void addUserToList(List<User> users, Scanner scanner, int n){
        for (;n>=0;n--){
            while (!scanner.hasNextLine()){
                System.out.println("Couldn't parse a number. Please, try again");
                scanner.next();
            }
            String name = scanner.nextLine();

            while (!scanner.hasNextInt()){
                System.out.println("Couldn't parse a String. Please, try again");
                scanner.next();
            }
            int age = scanner.nextInt();
            scanner.nextLine();

            if(age<=0){
                System.out.print("Incorrect input. Age <= 0\n");
                continue;
            }
            users.add(new User(name,age));
        }
    }
}
