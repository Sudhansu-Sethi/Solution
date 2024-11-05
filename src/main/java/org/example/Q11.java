package org.example;

public class Q11 {

    public void call() {
        int[] arr = {5, 6, 1, 2, 3, 4};

        int len = arr.length;

        int left = 0;
        int right = len - 1;

        int result = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = (left + right) / 2;

            // search space is already sorted
            // then always arr[low] is will be smaller
            // in that search space
            if (arr[left] <= arr[right]) {
                result = Math.min(result, arr[left]);
                break;
            }

            // Left half sorted
            if (arr[left] <= arr[mid]) {
                result = Math.min(result, arr[left]);
                left = mid + 1;
            }
            // Right half sorted
            else {
                result = Math.min(result, arr[mid]);
                right = mid - 1;
            }
        }

        System.out.println(result);
    }

}
