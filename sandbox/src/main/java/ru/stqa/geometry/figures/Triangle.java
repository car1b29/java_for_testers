package ru.stqa.geometry.figures;

public class Triangle
{
    public static void main(String[] args) {
        
        printTriangleArea(7.2, 2.1,8.1);

    }

    public static void printTriangleArea(double a, double b, double c) {
        ;
        System.out.println("S Triangle = " + TriangleArea(a, b, c ))  ;

    }


    public static double TriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }



}

