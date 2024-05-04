package com.company;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        System.out.println ("Введите первую необходимую строку и нажмите Enter");
        Scanner scan = new Scanner(System.in); // Ввод строк
        String a = scan.nextLine();
        System.out.println ("Введите вторую необходимую строку и нажмите Enter");
        Scanner scanner = new Scanner(System.in); // Ввод строк
        String b = scanner.nextLine();
        System.out.println("Строка a: " + a);
        System.out.println("Строка b: " + b);
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Строки идентичны" );}
        else System.out.println("Строки неидентичны");

    }
}
