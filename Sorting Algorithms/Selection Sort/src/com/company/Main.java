package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {28, 15, -150, 798, 5, 1};

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i<=lastUnsortedIndex; i++){
                if(arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap (arr, largest, lastUnsortedIndex);
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

