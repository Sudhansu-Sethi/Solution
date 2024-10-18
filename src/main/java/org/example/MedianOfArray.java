package org.example;

import java.util.Arrays;

public class MedianOfArray {

    public static double findMedian(int[] array) {
        Arrays.sort(array);

        int n = array.length;


        if (n % 2 == 1) {
            return array[n / 2];
        } else {
            return (array[(n - 1) / 2] + array[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};
        int arSize = arr1.length + arr2.length;
        int[] arr3 = new int[arSize];
        for(int i=0; i<arr1.length; i++){
            arr3[i]=arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[arr1.length+i]=arr2[i];
        }

        double median = findMedian(arr3);
        System.out.println("Median: " + median);
    }
}
