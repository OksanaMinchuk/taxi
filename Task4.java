package by.oksana.lesson2;

// Проверить трехзначное число на четность и найти сумму его цифр,
// если число четное, или произведение его цифр, если число нечетное.

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");
        int x = in.nextInt();
        String len = String.valueOf(x);
        int n = len.length();
        int a=0;
        int b,c;

        System.out.println(n+"---"+len);

        if (x<100 || x>999) {
            System.out.println("x=" + x + " - Неверно. Введите трехзначное положительное число");
        } else
            a = (x/100)%10; //первая цифра
            b = (x/10)%10; //вторая цифра
            c = x%10; //третья цифра
                    if (x%2 == 0) {
                    System.out.println("Число четное, сумма цифр = "+(a+b+c));
                } else
                    System.out.println("Число нечетное, произведение цифр = "+(a*b*c));
    }
}
