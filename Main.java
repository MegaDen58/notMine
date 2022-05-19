package com.company;

import java.util.Scanner;

class FirstClass{
    double a, b, c;

    public FirstClass(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void toSolve(double a, double b, double c){
        System.out.println(Math.pow((a * b), c));
    }
}

class SecondClass{
    double a, b, c;

    public SecondClass(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void toSolve(double a, double b, double c){
        System.out.println(Math.pow((a * b), c));
    }
}

@FunctionalInterface
interface Converter<First, Second>{
    Second convert(First f);

    static <First> boolean isNotNull(First f){
        return f != null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения:");
        System.out.print("A: \n");
        double a = in.nextDouble();
        System.out.print("B: \n");
        double b = in.nextDouble();
        System.out.print("C: \n");
        double c = in.nextDouble();
        FirstClass fc = new FirstClass(a, b, c);
        Converter<FirstClass, SecondClass> converter = x -> new SecondClass(x.a, x.b, x.c);
        SecondClass sc = converter.convert(fc);
        sc.toSolve(a, b, c);

    }
}