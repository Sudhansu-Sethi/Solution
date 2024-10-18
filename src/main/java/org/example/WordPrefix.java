package org.example;

class WordPrefix{
    public static void main(String[] args) {

        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        for(int i=0;i<arr.length;i++){
            if(arr[i].startsWith(prefix)){
                System.out.println(arr[i]);
            }
        }


    }
}
