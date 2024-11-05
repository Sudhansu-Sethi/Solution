package org.example;

public class ReverseVowels {

    public static void main(String[] args) {

        String s ="IceCreAm";

        String vowels = "aeiouAEIOU";
        String c ="";

        for (int i =0;i<s.length();i++){

            if(vowels.contains(""+s.charAt(i))){
              c= s.charAt(i)+c;
            }else{
                c=c+s.charAt(i);
            }
        }
        System.out.println(c);
    }
}
