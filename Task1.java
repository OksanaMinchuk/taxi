package by.oksana.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter");
        Scanner scan = new Scanner(System.in);
        int i = in.nextInt();

        System.out.println(i+" в двоичной системе "+Integer.toBinaryString(i)); //перевод из десятичной в двоичную
        System.out.println(i+" в восьмиричной системе "+Integer.toOctalString(i)); //перевод из десятичной в восьмиричную
        System.out.println(i+" в шестнадцатиричной системе "+Integer.toHexString(i)); //перевод из десятичной в шестнадцатиричную


        //System.out.println(0b110001);
        //System.out.println(0x49);
        System.out.println(0b00000001);
        System.out.println(0b11111000);
        System.out.println(0b11101101);
        System.out.println(0b10110000);
        System.out.println(0b00000010);

        //System.out.println(Integer.parseInt("1010",2)); //перевод из двоичной в десятичную
    }
}

