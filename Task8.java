package by.oksana.lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите \n 1 - сортировать по возрастанию кол-ва цифр, \n 2 - сортировать по убыванию кол-ва цифр");
        int choose = 0;
        choose = in.nextInt();
        System.out.println("Введите количество чисел");
        int n = in.nextInt();
        int[] myArray = new int[n];
        int[] lengthNumber = new int[n];

        //создать массив чисел и массив количества чисел
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Введите число");
            myArray[i] = in.nextInt();
            String len = String.valueOf(myArray[i]);
            lengthNumber[i] = len.length();
        }

        switch (choose) {
            case 1:
                    // по возрастанию
            for (int j = 1; j < lengthNumber.length - 1; j++) {
                for (int i = 0; i < lengthNumber.length - 1; i++) {
                    if (lengthNumber[i] > lengthNumber[i + 1]) {
                    int a = lengthNumber[i];
                    lengthNumber[i] = lengthNumber[i + 1];
                    lengthNumber[i + 1] = a;

                    int b = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = b;
                    }
                }
            }
                System.out.println("по возрастанию");
                for (int i=0; i<lengthNumber.length; i++) {
                    System.out.println(i+" - "+myArray[i]+"--"+lengthNumber[i]+" -цифры; ");
                }
            break;
            case 2:
                    // по убыванию
            for (int j = 1; j < lengthNumber.length - 1; j++) {
                for (int i = 0; i < lengthNumber.length - 1; i++) {
                    if (lengthNumber[i] < lengthNumber[i + 1]) {
                    int a = lengthNumber[i];
                    lengthNumber[i] = lengthNumber[i + 1];
                    lengthNumber[i + 1] = a;

                    int b = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = b;
                    }
                }
            }
                System.out.println("по убыванию");
                for (int i=0; i<lengthNumber.length; i++) {
                    System.out.println(i+" - "+myArray[i]+"--"+lengthNumber[i]+" -цифры; ");
                }
            break;
        }
    }
}
