package com.company.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, detail;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        detail = b*b -4*a*c;
        if (detail<0){
            System.out.println("The equation has no roots");
        }else if (detail==0){
            x1=(-b/(2*a));
            System.out.println("The equation has one root: " + x1);
        }else {
            x1 = (float) ((-b + Math.sqrt(detail))/2*a);
            x2 = (float) ((-b - Math.sqrt(detail))/2*a);
            System.out.println("The equation has 2 root, x1= " + x1 + " and x2= " + x2);
        }
    }
}
