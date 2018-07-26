package by.oksana.lesson2;

//В переменную записываем число.
//Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//Например, "это однозначное положительное число"

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();

        String c = String.valueOf(x);
        int n = c.length();
            if (x>0){
            System.out.println("x="+x+" это "+n+"-значное положительное число");
        }
        else if (x<0){
            n = n-1;
            System.out.println("x="+x+" это "+n+"-значное отрицательное число");
        }
        else {
            System.out.println("x="+x+'\n'+"Введите другое число");
        }
    }
}
