package by.oksana.lesson2;

// Дано целое число k (1≤k≤365). Определить, каким будет k-ый день года: суббота, воскресенье или рабочий день, если 1 января – вторник

import java.util.Scanner;

public class Task10 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 365");
        int k = in.nextInt();

        if ((k%7)==5) {
            System.out.println("суббота");
        } else if ((k%7)==6) {
            System.out.println("воскресенье");
        } else
            System.out.println("рабочий день");

    }
}
