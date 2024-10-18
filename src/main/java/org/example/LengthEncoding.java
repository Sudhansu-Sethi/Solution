package org.example;

import java.util.*;
class LengthEncoding{
    public static void main(String[] args) {

        String latter = "aabbbcccdd";
        String output = "";
        HashMap<String,Integer> occurance = new HashMap();

        for(int i=0; i<latter.length();i++){
            String a = ""+ latter.charAt(i);
            if(occurance.containsKey(a)){
                int count = occurance.get(a)+1;
                occurance.put(a,count);

            }else{
                occurance.put(a,1);
            }

        }
        for(Map.Entry<String,Integer> a:occurance.entrySet()){
            output=output+a.getKey()+a.getValue();

        }

        System.out.println(output);
    }
}