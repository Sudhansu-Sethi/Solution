package org.example;

import javax.swing.text.html.parser.Entity;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {
        public static void main(String[] args) {

            String str1 = "12345";
            LinkedHashMap<Character,Integer> occurance = new LinkedHashMap<>();


//String str2 = ""abbacd""

            for (int i = 0; i < str1.length(); i++) {
                if(occurance.containsKey(str1.charAt(i))){
                    int number = occurance.get(str1.charAt(i))+1;
                    occurance.put(str1.charAt(i),number);
                }else {
                    occurance.put(str1.charAt(i), 1);
                }

            }
            for(Map.Entry<Character, Integer> count : occurance.entrySet()){
                if(count.getValue() == 1){
                    System.out.println(count.getKey());
                    break;
                }
            }

        }
}
