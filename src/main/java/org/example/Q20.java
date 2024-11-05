package org.example;

public class Q20 {

    public void call() {
        String str = "aabbbbCCddd";

        int maxIndex = 0;
        int currentIndex = 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            char chPrev = str.charAt(i - 1);
            char ch = str.charAt(i);
            if (ch == chPrev) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxIndex = currentIndex;
                }
                currentLength = 1;
                currentIndex = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxIndex = currentIndex;
        }

        System.out.println("Starting index: " + maxIndex);
        System.out.println("Length: " + maxLength);
        System.out.println("Substring: " + str.substring(maxIndex, maxIndex + maxLength));
    }

}