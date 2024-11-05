package org.example;

public class Switching100LightBulbs {

    public void call() {
        int n = 100; // Number of bulbs
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
//            System.out.println(i * i);
            count++;
        }

        System.out.println(count);
    }

    public void call2() {
        int n = 100;

        int count = (int) Math.sqrt(n);

        System.out.println(count);
    }

    public void call3() {
        int n = 100;

        boolean[] bulbs = new boolean[n + 1]; // false by default (all bulbs start off)

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j = j + i) {
                bulbs[j] = !bulbs[j]; // Toggle the bulb
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (bulbs[i]) {
//                System.out.println(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
