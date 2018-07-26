package by.oksana.lesson2;

// Среди трех чисел найти среднее. Если среди чисел есть равные, вывести сообщение "Ошибка".

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = in.nextInt();

        System.out.println("Введите второе число");
        int y = in.nextInt();

        System.out.println("Введите третье число");
        int z = in.nextInt();

        int a=0;

        if (x==y || x==z || y==z) {
            System.out.println("Ошибка. Есть два равных числа");
        }
        else
            a=(x+y+z)/3;
            System.out.println("Среднее значение = "+a);
    }
}
