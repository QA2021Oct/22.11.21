package com.company;

import java.util.Scanner;

public class scope {

    static Scanner s = new Scanner(System.in);
    static int globalInt = 40;

    public static void main(String[] args) {
        getNumberFromUser(s);
        int x = s.nextInt();
        globalInt = 80;
    }

    private static void getNumberFromUser(Scanner s) {
        int x = s.nextInt();
        int y = 8;
    }

    private static void getNumberFromUser3(Scanner s) {
        int x = s.nextInt();
    }
}