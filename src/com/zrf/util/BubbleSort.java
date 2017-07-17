package com.zrf.util;

/**
 * Created by zhao on 2017/7/17.
 * 冒泡排序
 * 空间复杂度O(1)
 * 时间复杂度，最坏情况下O(n^2)，最好情况下O(n)，平均时间复杂度为O(N^2)
 */
public class BubbleSort {
    public static void bubbleSort(int[] numbers) {
        int length = numbers.length;
        if (length <= 0) {
            return;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }

    //增加一个标志变量，对于每次的比较，标志是否有交换，如果没有交换则已经排序好，可以结束下一轮的比较排序
    public static void bubbleSort_1(int[] numbers) {
        int length = numbers.length;
        if (length <= 0) {
            return;
        }
        for(int i = 0; i< length-1; i++){
            boolean flag = false;  //本一次排序是否有数据交换
            for(int j=length-1;j>i;j--){
                if(numbers[j-1]>numbers[j]){
                    flag = true;
                    int tmp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j]= tmp;
                }
            }
            if(flag == false){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers1 = {};
        int[] numbers2 = {2, 6, 8, 1, 56, 23, 79};
        int[] numbers3 = {0, 1, 2, 3, 4, 5, 6, 8, 9};
        bubbleSort_1(numbers1);
        printArray(numbers1);
        bubbleSort_1(numbers2);
        printArray(numbers2);
        bubbleSort_1(numbers3);
        printArray(numbers3);

    }

    public static void printArray(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
