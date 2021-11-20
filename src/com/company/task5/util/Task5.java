package com.company.task5.util;

public class Task5 {
    public static void solution(double[] array){
        max = 1;

        for (double x: array) {
            System.out.print(x + " ");
        }
        System.out.println();

        boolean invalid = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                invalid = false;
                break;
            }
        }

        if (invalid) {
            System.out.println("Невозможно вычеркнуть элементы так, чтобы получить возрастающую последовательность,\n" +
                    "так как исходная последовательность - убывающая\n");
        } else {
            for (int i = 0; i<array.length; i++) {
                findWay(array,i,1);
            }

            System.out.println("Для получения возрастающей подпоследовательности нужно вычеркнуть минимум " +
                    (array.length-max) + " элементов\n");
        }
    }

    private static int max = 1;

    private static void findWay(double[] array, int curPos, int depth){
        for (int i = curPos+1; i<array.length; i++) {
            if (array[i]>array[curPos]) {
                findWay(array, i,depth+1);
            }
        }
        if(depth > max) max=depth;
    }
}
