package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int counterOne = 0;
            int counterZero = 0;
            System.out.print("Введите строку: ");
            String input = in.nextLine();
            for (char c : input.toCharArray()) {
                if (c == '1') {
                    counterOne++;
                } else if (c == '0') {
                    counterZero++;
                }
            }
            if(counterOne + counterZero == input.length()){
                System.out.printf("Количество 0: %d\nКоличество 1: %d\nОбщее количество символов: %d", counterZero, counterOne, input.length());
                break;
            }
            else{
                System.out.println("Ошибка ввода.");
            }
        }
    }
}
