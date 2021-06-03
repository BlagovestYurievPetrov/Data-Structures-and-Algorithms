package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {28, 15, -150, 798, 5, 1};

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
        // Printing
        printArr(arr);


    }
    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
