package org.example;

import MyOPZ.MyOPZ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyOPZ reversePolishNotation = new MyOPZ(scanner.nextLine());
        if (!reversePolishNotation.getCorrectNotation()) {
            System.out.println("Некорректные данные");
        } else {
            System.out.println(reversePolishNotation.getResult());
        }
    }
}