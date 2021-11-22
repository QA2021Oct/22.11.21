package com.company;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //1:
        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = s.nextInt();
        System.out.println("Enter second number: ");
        num2 = s.nextInt();
        getTotal(num1, num2);

        //2:
        System.out.println("Enter some number - ");
        int ifZugi = s.nextInt();
        isEven(ifZugi);

        //3:
        isPrime(12);

        //4:
        findMinValue(3.5, 9.99, 0.23);
        findMinValue(5, 8.65, 8.64);

    }
    //1:
    public static void getTotal(int num1, int num2){
        System.out.println(num1 + num2);
    }

    //2:
    public static void isEven(int number){
        // % --> reminder
        if(number % 2 == 0){ // 10 % 2 = 0
            System.out.println("number is Even");
        }else{
            System.out.println("number if not Even");
        }
    }

    //3: Prime number
    public static void isPrime(int number ){   // divide by himself and 1 !
        boolean  isPrime = true;

        for(int i=2; i < number; i++){   // 2- number (6- > 2 3 4 5  )
            if(number % i == 0 ){
                isPrime = false;
            }
        }
        System.out.println("is 3 prime? " + isPrime);
    }

    //4:
    public static void findMinValue(double num1, double num2, double num3) {
        System.out.println(Math.min(Math.min(num1,num2),num3));
    }
}

