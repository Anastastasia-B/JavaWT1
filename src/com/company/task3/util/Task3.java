package com.company.task3.util;

public class Task3 {
    public static void solution(double a, double b, double h) {
        double x = a;
        System.out.printf("%9s %9s\n", "Arg.", "Func.");
        do {
            System.out.printf("%9.1f %9.3f\n", x, function(x));
        } while (!((x += h) > b));
    }

    private static double function(double arg) {
        double radians = Math.toRadians(arg);
        return Math.tan(radians);
    }
}
