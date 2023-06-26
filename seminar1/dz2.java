package org.example.seminar1;
import java.util.Scanner;
public class dz2 {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
            System.out.println("Вы ввели: " + strNum);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод ");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        String a = scanner.nextLine();
        isNumeric(a);
    }
}