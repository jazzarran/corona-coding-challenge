package com.jazzcorp;

public class StringReverser {

    public static void main(String args[]){
        System.out.println(myReverse("abcdefghijk"));
        System.out.println(reverse("abcdefghijk"));
    }

    public static String myReverse(String input){
        char[] inputArray = input.toCharArray();
        char[] resultArray = new char[inputArray.length];

        for(int i= (inputArray.length-1), j=0; i>=0 ; i--, j++){
            char temp = inputArray[i];
            resultArray[j] = temp;
        }

        return new String(resultArray);
    }

    public static String reverse(String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb = sb.reverse();

        return sb.toString();
    }
}
