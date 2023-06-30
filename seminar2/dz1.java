package org.example.seminar2;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        try {
            check(num);
        } catch (InvalidNumberException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void check(int num) throws InvalidNumberException{
        if(num < 1) throw new InvalidNumberException("Некорректное число");
        System.out.println("Число корректно");
    }
}

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}
