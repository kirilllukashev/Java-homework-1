import java.util.Scanner;
import java.io.*;
public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table(){
        for (int a = 0; a <= 10; ++a) {
            for (int b = 0; b <= 10; ++b) {
                System.out.print(a * b);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int val = 0;
        while (n != 0) {
            val += (n % 10);
            n /= 10;
        }
        return val;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        }
        return 365;
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n){
        if (n == "Понедельник") return 1;
        else if (n == "Вторник") return 2;
        else if (n == "Среда") return 3;
        else if (n == "Четверг") return 4;
        else if (n == "Пятница") return 5;
        else if (n == "Суббота") return 6;
        else return 7;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array){
        int length = array.length;
        System.out.print('[');
        for (int i = 0; i < length; ++i) {
            System.out.print(array[i]);
            if (i != length - 1) System.out.print(", ");
        }
        System.out.println(']');
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array){
        int quantityArray = array.length;
        int length;
        for (int i = 0; i < quantityArray; ++i) {
            length = array[i].length;
            System.out.print('[');
            for (int j = 0; j < length; ++j) {
                System.out.print(array[i][j]);
                if (j != length - 1) System.out.print(", ");
            }
            System.out.println(']');
        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; ++i) {
                if(array[i] > array[i + 1]) {
                    int buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        return array;
    }
    //здесь можете тестировать свои решения
    public static void main(String[] args){
        /*FileWriter writer = new FileWriter("notes3.txt", false)
        String text = "Hello Gold!";
        writer.write(text);*/

        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}