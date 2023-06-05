package org.example;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Task 1");
        System.out.println("Input A:");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        System.out.println("Input B:");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println(A + B);
        } else if (A == B) {
            System.out.println(A * B);
        } else {
            System.out.println(A - B);
        }
    }

    public static void task2() {
        System.out.println("\nTask 2");
        System.out.println("Input X:");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        System.out.println("Input Y:");
        int Y = scanner.nextInt();

        if (X > 0 && Y > 0) {
            System.out.println("The coordinate " + X + "," + Y + " belongs to the first quarter");
        } else if (X > 0 && Y < 0) {
            System.out.println("The coordinate " + X + "," + Y + " belongs to the fourth quarter");
        } else if (X < 0 && Y > 0) {
            System.out.println("The coordinate " + X + "," + Y + " belongs to the second quarter");
        } else {
            System.out.println("The coordinate " + X + "," + Y + " belongs to the third quarter");
        }
    }

    public static void task3() {
        System.out.println("\nTask 3");
        System.out.println("Input A:");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        System.out.println("Input B:");
        int B = scanner.nextInt();

        System.out.println("Input C:");
        int C = scanner.nextInt();

        if (A > B && B > C) {
            System.out.println(C + ", " + B + ", " + A);
        } else if (A > B && B < C) {
            System.out.println(B + ", " + C + ", " + A);
        } else if (B > A && A > C) {
            System.out.println(C + ", " + A + ", " + B);
        } else if (B > A && A < C) {
            System.out.println(A + ", " + C + ", " + B);
        } else if (C > B && B > A) {
            System.out.println(A + ", " + B + ", " + C);
        } else {
            System.out.println(B + ", " + A + ", " + C);
        }
    }

    public static void task4() {
        System.out.println("\nTask 4");
        System.out.println("Input a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Input b:");
        int b = scanner.nextInt();

        System.out.println("Input c:");
        int c = scanner.nextInt();

        double root1, root2;
        int determinant = b ^ 2 - 4 * a * c;


        if (determinant > 0) {
            root1 = (-b + sqrt(determinant)) / (2 * a);
            root2 = (-b - sqrt(determinant)) / (2 * a);
            System.out.println("The roots are " + root2 + ", and " + root1);
        } else if (determinant == 0) {
            root2 = (-b + sqrt(determinant)) / (2 * a);
            System.out.println("The root is " + root2);

        } else {
            System.out.println("The roots are irrational");
        }
    }

    public static void task5() {
        System.out.println("\nTask 5");
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            checkNumber(number);
        } catch (NotDoubleDigitException e) {
            System.out.println("The number is not two digits");
           // return; как остановить программу именно тут для этой части кода?
        }

        String[] tensNames = {
                "",
                "",
                "twenty",
                "thirty",
                "forty",
                "fifty",
                "sixty",
                "seventy",
                "eighty",
                "ninety",
        };
        String[] numberNames = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
        };

        int firstDigit = number/10;
        int secondDigit = number%10;
        System.out.println(tensNames[firstDigit] + " " + numberNames[secondDigit]);

        if (number >= 10 && number < 20) {
            switch (number) {
                case (10):
                    System.out.println("ten");
                    break;
                case (11):
                    System.out.println("eleven");
                    break;
                case (12):
                    System.out.println("twelve");
                    break;
                case (13):
                    System.out.println("thirteen");
                    break;
                case (14):
                    System.out.println("fourteen");
                    break;
                case (15):
                    System.out.println("fifteen");
                    break;
                case (16):
                    System.out.println("sixteen");
                    break;
                case (17):
                    System.out.println("seventeen");
                    break;
                case (18):
                    System.out.println("eighteen");
                    break;
                case (19):
                    System.out.println("nineteen");
                    break;
            }
        }
    }

    public static void checkNumber(int number) throws NotDoubleDigitException {
        if (number < 10 || number >= 100) {
            throw new NotDoubleDigitException("Input a two digit number");
        }
    }

    public static void task6() {
        System.out.println("\nTask 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input r:");
        int r = scanner.nextInt();
        System.out.println("Input x:");
        int x = scanner.nextInt();
        System.out.println("Input y:");
        int y = scanner.nextInt();
        System.out.println("Input x0:");
        int x0 = scanner.nextInt();
        System.out.println("Input y0:");
        int y0 = scanner.nextInt();

        if ((x - x0) * (x - x0) + (y - y0) * (y - y0) < r * r) {
            System.out.println("The coordinate " + x + ", " + y + " is inside the circle");
        } else if ((x - x0) * (x - x0) + (y - y0) * (y - y0) == r * r) {
            System.out.println("The coordinate " + x + ", " + y + " is on the circle");
        } else {
            System.out.println("The coordinate " + x + ", " + y + " is outside the circle");
        }
    }

    public static void task7() {
        System.out.println("\nTask 7");
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextDouble();
        System.out.println(check(number));
    }

    private static boolean check(double number) {
        double a = number/100;
        double b = number/1000;
        double c = number/10000;
        if (a == 0 || b == 0 || c == 0) {
            return true;
        }
        return false;
    }
    private static boolean check(int number) {
        if (number / 100 != 0 && number / 1000 == 0) { //a
            int a = number/100;
            int b = number/10%10;
            int c = number%10;
            if (number * number == a*a*a + b*b*b + c*c*c) {
                return true;
            }
            if (a == b || a == c || b == c) { //c
                return true;
            }
        }

        if (number / 1000 != 0 && number / 10000 == 0) { //b
            int a = number/1000;
            int b = number/100%10;
            int c = number/10%10;
            int d = number%10;
            return a + b == c + d;
        }


        return false;
    }
}