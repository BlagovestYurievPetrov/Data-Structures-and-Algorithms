package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {28, 15, -150, 798, 5, 1};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int current = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i-1] > current; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = current;


        }
        // Printing
        printArr(arr);


    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

