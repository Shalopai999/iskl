package org.example.seminar2;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        try {
            int result = check(a, b);
            System.out.println("Результат деления = " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int check(int num1, int num2) throws DivisionByZeroException{
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }
}

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
