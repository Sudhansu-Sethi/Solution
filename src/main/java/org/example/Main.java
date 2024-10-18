package org.example;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        String str = "the quick the brown quick brown the frog";
        String a="quick";
        String b ="frog";
        int c =0;
        String [] ar = str.split(" ");
        TreeSet tree = new TreeSet<>();
        for(int i=0;i<ar.length;i++){
            if(ar[i].equals(a)){
                c=0;
            }

            if(ar[i].equals(b)){
                tree.add(c-1);
            }
            c++;
        }
        System.out.println(tree.first());
    }
}