package org.example;


//import static com.sun.crypto.provider.BlowfishCrypt.pi;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        task7();
    }

//    public static void task1() {
//        System.out.println("Task 1");
//        System.out.println("Input A:");
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//
//        System.out.println("Input B:");
//        int B = scanner.nextInt();
//
//        if (A > B) {
//            System.out.println(A + B);
//        } else if (A == B) {
//            System.out.println(A * B);
//        } else {
//            System.out.println(A - B);
//        }
//    }

//    public static void task2() {
//        System.out.println("\nTask 2");
//        System.out.println("Input X:");
//        Scanner scanner = new Scanner(System.in);
//        int X = scanner.nextInt();
//
//        System.out.println("Input Y:");
//        int Y = scanner.nextInt();
//
//        if (X > 0 && Y > 0) {
//            System.out.println("The coordinate " + X + "," + Y + " belongs to the first quarter");
//        } else if (X > 0 && Y < 0) {
//            System.out.println("The coordinate " + X + "," + Y + " belongs to the fourth quarter");
//        } else if (X < 0 && Y > 0) {
//            System.out.println("The coordinate " + X + "," + Y + " belongs to the second quarter");
//        } else {
//            System.out.println("The coordinate " + X + "," + Y + " belongs to the third quarter");
//        }
//    }
//
//    public static void task3() {
//        System.out.println("\nTask 3");
//        System.out.println("Input A:");
//        Scanner scanner = new Scanner(System.in);
//        int A = scanner.nextInt();
//
//        System.out.println("Input B:");
//        int B = scanner.nextInt();
//
//        System.out.println("Input C:");
//        int C = scanner.nextInt();
//
//        if (A > B && B > C) {
//            System.out.println(C + ", " + B + ", " + A);
//        } else if (A > B && B < C) {
//            System.out.println(B + ", " + C + ", " + A);
//        } else if (B > A && A > C) {
//            System.out.println(C + ", " + A + ", " + B);
//        } else if (B > A && A < C) {
//            System.out.println(A + ", " + C + ", " + B);
//        } else if (C > B && B > A) {
//            System.out.println(A + ", " + B + ", " + C);
//        } else {
//            System.out.println(B + ", " + A + ", " + C);
//        }
//    }
//
//    public static void task4() {
//        System.out.println("\nTask 4");
//        System.out.println("Input a:");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        System.out.println("Input b:");
//        int b = scanner.nextInt();
//
//        System.out.println("Input c:");
//        int c = scanner.nextInt();
//
//        double root1, root2;
//        int determinant = b ^ 2 - 4 * a * c;
//
//
//        if (determinant >= 0) {
//            root1 = (-b + sqrt(determinant)) / (2 * a);
//            root2 = (-b - sqrt(determinant)) / (2 * a);
//            System.out.println("The roots are: " + root1 + " and " + root2);
//        } else {
//            System.out.println("The roots are irrational");
//        }
//    }
//
//    public static void task5() {
//        System.out.println("\nTask 5");
//        System.out.println("Input a:");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        try {
//            checkNumber(number);
//        } catch (NotDoubleDigitException e) {
//            System.out.println("The number is not two digits");
//            return;
//        }
//        String[] tensNames = {
//                "",
//                "",
//                "twenty",
//                "thirty",
//                "forty",
//                "fifty",
//                "sixty",
//                "seventy",
//                "eighty",
//                "ninety",
//        };
//        String[] numberNames = {
//                "zero",
//                "one",
//                "two",
//                "three",
//                "four",
//                "five",
//                "six",
//                "seven",
//                "eight",
//                "nine",
//        };
//
//        int firstDigit = number/10;
//        int secondDigit = number%10;
//        System.out.println(tensNames[firstDigit] + " " + numberNames[secondDigit]);
//
//        switch (number) {
//            case (10):
//                System.out.println("ten");
//                break;
//            case (11):
//                System.out.println("eleven");
//                break;
//            case (12):
//                System.out.println("twelve");
//                break;
//            case (13):
//                System.out.println("thirteen");
//                break;
//            case (14):
//                System.out.println("fourteen");
//                break;
//            case (15):
//                System.out.println("fifteen");
//                break;
//            case (16):
//                System.out.println("sixteen");
//                break;
//            case (17):
//                System.out.println("seventeen");
//                break;
//            case (18):
//                System.out.println("eighteen");
//                break;
//            case (19):
//                System.out.println("nineteen");
//                break;
//        }
//    }
//
//    public static void checkNumber(int number) throws NotDoubleDigitException {
//        if (number / 100 != 0 || number > -10 || number < 10) {
//            throw new NotDoubleDigitException("Input a two digit number");
//        }
//
//    }
//    public static void task6() {
//        System.out.println("\nTask 6");
//        Scanner scanner = new Scanner(System.in);
//        int r = scanner.nextInt();
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int x0 = scanner.nextInt();
//        int y0 = scanner.nextInt();
//
//        if ((x - x0) * (x - x0) + (y - y0) * (y - y0) < r * r) { //почему нельзя сделать r^2?
//            System.out.println("The coordinate " + x + ", " + y + " is inside the circle");
//        } else {
//            System.out.println("The coordinate " + x + ", " + y + " is outside the circle");
//        }
//    }

    public static void task7() {
        System.out.println("\nTask 7");

    }
}