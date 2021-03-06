package javase01.t02;

/**
 * Задание 2. Циклы, типы данных

 Найти наименьший номер элемента последовательности, для которого выполняется условие M.
 Вывести на экран этот номер и все элементы ai  где i = 1, 2, ..., п.

 */
public class Main {
    public static void main(String[] args) {

        // Начальные константы e и n
        final double e = 0.015;
        final int n = 10;

        // Первый цикл прерывается при нахождении
        // минимального номера последовательности
        for (int i = 1; i <= n ; i++ ){
            double a;
            a = 1 / Math.pow((i + 1),2);

            if (a < e){
                System.out.println("Min i = " + (i));
                // Второй цикл выводит все элементы ai
                for (int j = 1; j <= i; j++){
                    // Если использовать массивы
                    // повторные вычисления ai не обязательны
                    a = 1 / Math.pow((j + 1),2);
                    System.out.println( j+ " : " + a);
                }
                break;
            }
        }

    }
}


