package org.example;

import java.util.*;
class LongestWord{
    public static void main(String[] args) {

        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        TreeMap<Integer,String> occurance = new TreeMap();
        //Returns 9 (LODGESSSS)"
        for(int i =0;i<dict.length;i++){
            if(dict[i].contains(toSearch)){
                occurance.put(dict[i].length(),dict[i]);
            }
        }
        System.out.println(occurance.get(occurance.lastKey()));
    }
}
