package by.oksana.lesson2;

// Написать программу вычисления стоимости покупки с учетом скидки. Скидка в 3% предоставляется в том случае, если сумма покупки больше 500 руб., в 5% - если сумма больше 1000 руб

import java.util.Scanner;

public class Task6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму покупки");
        int x = in.nextInt();

        if (x < 500) {
            System.out.println("Скидки нет, стоимость покупки= " + x + " руб.");
            } else if (x>=500 && x<=1000) {
            System.out.println("Скидка 3%, стоимость покупки= "+(x * 0.97)+" руб.");
        } else
            System.out.println("Скидка 5%, стоимость покупки= " + (x * 0.95) + " руб.");
    }
}
