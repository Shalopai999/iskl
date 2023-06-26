package org.example;
import java.util.Scanner;
public class Main {
    public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        try {
            int result = divide(a, b);
            System.out.println("Результат деления = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Произошла ошибка деления: "+ e.getMessage());
        }
    }
}