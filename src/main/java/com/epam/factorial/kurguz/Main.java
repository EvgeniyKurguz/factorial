package com.epam.factorial.kurguz;


public class Main {
    public static void main(String[] args) {
            long x = 1;
            long r = factorial(x);
            System.out.println(x);
        }

    private static long factorial(long x) {
        if (x < 0) {
            throw new IllegalArgumentException("x must be>=0");
            if (x <= 2) return 1;
            return x * factorial(x - 1);
        }
            try {
                return x * factorial(x - 1);
            } catch (Error e) {
                System.out.println(x);
                return 0;

            }
        }
    }