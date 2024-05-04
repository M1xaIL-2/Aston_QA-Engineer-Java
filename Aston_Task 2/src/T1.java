package com.company;
import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ввод числа
        int  a = scanner.nextInt(); // Передача переменной a введённого значения
        int  b = scanner.nextInt(); // Передача переменной b введённого значения
        if (a<b) {System.out.println("a<b");}
        else if (a>b) {System.out.println("a>b");}
        else {System.out.println("a=b");}
        int add = a+b;
        System.out.println("a+b= " + add);
        int sub1 = a-b;
        System.out.println("a-b= " + sub1);
        int sub2 = b-a;
        System.out.println("b-a= " + sub2);
        int multi = a*b;
        System.out.println("a*b= " + multi);
        if (b==0)  {System.out.println("Деление на ноль!");}
        else System.out.println("a/b= " + a/b);
        if (a==0)  {System.out.println("Деление на ноль!");}
        else System.out.println("b/a= " + b/a);
        // деление с остатком
        if (b==0)  {System.out.println("Деление на ноль!");}
        else System.out.println("a%b= " + a%b);
        if (a==0)  {System.out.println("Деление на ноль!");}
        else System.out.println("b%a= " + b%a);
    }
}
