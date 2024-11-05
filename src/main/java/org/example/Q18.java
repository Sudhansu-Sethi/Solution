package org.example;

public class Q18 {

    public void call() {
        int[] arr = {0, 1, 3, 4};

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Left half sorted
            if (arr[mid] == mid) {
                low = mid + 1;
            }
            // Right half sorted
            else {
                high = mid - 1;
            }
        }

        System.out.println(low);
    }

}
