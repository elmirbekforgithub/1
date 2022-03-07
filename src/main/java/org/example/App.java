package org.example;

import java.sql.Connection;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static Scanner numeric = new Scanner(System.in);
    static Scanner forword = new Scanner(System.in);

    public static void main(String[] args) {
        RelationMethodsNeedSQL methodsNeedSQL = new RelationMethodsNeedSQL();
        while (true) {
            System.out.println("addUser    -> 1 ");
            System.out.println("deleteUSer -> 2");
            System.out.println("getUser    -> 3");
            System.out.print("Enter here: ");
            int choice = numeric.nextInt();
            if (choice == 1) {
                System.out.print("user name        : ");
                String name = forword.nextLine();
                System.out.print("user last_name   : ");
                String last_name = forword.nextLine();
                System.out.print("user age         : ");
                int age = numeric.nextInt();
                System.out.print("user country     : ");
                String country = forword.nextLine();
                methodsNeedSQL.addUser(name, last_name, age, country);
            } else if (choice == 2) {
                System.out.print("user id        : ");
                int delete = numeric.nextInt();
                methodsNeedSQL.deleteUser(delete);
            } else if (choice == 3) {
                System.out.print("enter id       : ");
                int get = numeric.nextInt();
                methodsNeedSQL.getId(get);
            }

        }
    }
}