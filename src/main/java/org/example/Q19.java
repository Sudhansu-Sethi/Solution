package org.example;

import java.util.HashMap;
import java.util.Map;

public class Q19 {

    public void call() {
        int num = 1;
        int den = -2;

        System.out.println(solution(num, den));
    }

    private String solution(int num, int den) {
        StringBuilder ans = new StringBuilder();

        if ((num < 0) ^ (den < 0)) {
            ans.append("-");
        }
        num = Math.abs(num);
        den = Math.abs(den);

        int q = num / den;
        int r = num % den;
        ans.append(q);

        if (r == 0) {
            return ans.toString();
        }

        ans.append(".");
        Map<Integer, Integer> map = new HashMap<>();

        while (r != 0) {
            if (map.containsKey(r)) {
                int len = map.get(r);
                ans.insert(len, "(");
                ans.append(")");
                break;
            } else {
                map.put(r, ans.length());
                r *= 10;
                q = r / den;
                r = r % den;
                ans.append(q);
            }
        }

        return ans.toString();
    }

}
