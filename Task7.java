package by.oksana.lesson2;

import java.util.Scanner;
// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
public class Task7 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = in.nextInt();
        int [] myArray = new int [n];
        int [] lengthNumber = new int[n];

        //создать массив чисел и массив количества чисел
        for (int i=0; i<=n-1; i++) {
            System.out.println("Введите число");
            myArray[i] = in.nextInt();
            String len = String.valueOf(myArray[i]);
            lengthNumber[i] = len.length();
        }

        int max = lengthNumber[0];
        int min = lengthNumber[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i=0; i<lengthNumber.length; i++) {
            int value = lengthNumber[i];
                if (value > max) {
                    max = value;
                    maxIndex = i;
                }
                if (value < min) {
                    min = value;
                    minIndex = i;
                }
        }

        for (int i=0; i<lengthNumber.length; i++) {
            System.out.println(myArray[i]+"--"+lengthNumber[i]+" -цифры; ");
        }

        System.out.println("самое длинное число "+myArray[maxIndex]+" с max кол. цифр "+lengthNumber[maxIndex]+"; ");
        System.out.println("самое короткое число "+myArray[minIndex]+" с min кол. цифр "+lengthNumber[minIndex]+"; ");
    }
}
