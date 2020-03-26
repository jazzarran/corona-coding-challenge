package com.jazzcorp;

public class PalindromeDetector {

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("abradacabra"));
    }

    public static boolean isPalindrome(String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        String reversedString = sb.reverse().toString();

        return (!input.isEmpty() && input.equals(reversedString)) ? true : false;
    }
}
