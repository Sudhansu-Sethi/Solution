package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q13 {

    public void call() {
        int[] arr = {2, 4, 6, 10, 2, 1};
        int K = 12;

        int minLen = Integer.MAX_VALUE;

        int sum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= K) {
                if (sum == K) {
                       minLen = Math.min(minLen, right - left + 1);
                }
                sum -= arr[left];
                left++;
            }
        }

        System.out.println(minLen);
    }

    public void call2() {
        int[] arr = {2, 4, 6, 10, 2, 1};
        int K = 12;

        int minLen = Integer.MAX_VALUE;

        // Store the current Prefix sum till ith index.
        int sum = 0;
        // Use map here to store the prefixSum ending at ith index.
        Map<Integer, Integer> prefixSumMap = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Check if the current prefix sum is equals to K
            if (sum == K) {
                // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, i + 1)));
                minLen = Math.min(minLen, i + 1);
            }

            // Required PrefixSum
            int rem = sum - K;
            // Check if there exist any required Prefix Sum or not
            if (prefixSumMap.containsKey(rem)) {
                // System.out.println(Arrays.toString(Arrays.copyOfRange(arr, prefixSumMap.get(rem) + 1, i + 1)));
                int len = i - prefixSumMap.get(rem);
                minLen = Math.min(minLen, len);
            }

            // Store the current prefix sum ending at i
            prefixSumMap.put(sum, i); // For Shortest Sub-array
            // prefixSumMap.putIfAbsent(sum, i); // For Longest Sub-array
        }

        System.out.println(minLen);
    }
}