package org.example;

class CovertToInteger{
    public static void main(String[] args) {


        String str = "-12a3";
        String str2 = "-123";

        System.out.println(compareString(str));
    }
    public static int compareString(String str){
        String result = "";
        for(int i=0;i<str.length();i++){

            if((i==0 &&(str.charAt(i)=='-' || str.charAt(i) =='+'))|| Character.isDigit(str.charAt(i))){
                result = result + str.charAt(i);
            }else{
                result = "-1";
                break;
            }
        }
        return Integer.parseInt(result);

    }
}
