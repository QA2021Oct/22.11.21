package com.company;

import java.util.Scanner;

public class Overloading {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x= 7;
        int y= 3;
        int z = 2;

        double c = 7.8;
        double d = 0.2;

        printSumAndDiff(x, y);
        printSumAndDiff(c, d);
        printSumAndDiff(x,y,z);
    }

    // Overloading:
    public static void printSumAndDiff(int x, int y) {
        System.out.println(String.format("%d + %d = %d", x, y, x + y));
    }
    public static void printSumAndDiff(double x, double y) {
        System.out.println(String.format("%f + %f = %f", x, y, x + y));
    }
    public static void printSumAndDiff(int x, int y, int z) {
        System.out.println(String.format("%d + %d + %d = %d", x, y, z, x + y+z));
    }
    public static void myFunction(){

    }
    public static void myFunction(int number, double dbl, String s){

    }
}
