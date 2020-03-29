package com.jazzcorp;

import java.util.stream.IntStream;

public class PrimeNumberDetector {

    public static void main(String[] args) {
        System.out.println("661 is prime: " + isPrime(661));
        System.out.println("3 is prime: " + isPrime(3));
        System.out.println("21 is prime: " + isPrime(21));
        System.out.println("7 is prime: " + isPrime(7));

        System.out.println("661 is prime: " + isPrimeStreams(661));
        System.out.println("3 is prime: " + isPrimeStreams(3));
        System.out.println("21 is prime: " + isPrimeStreams(21));
        System.out.println("7 is prime: " + isPrimeStreams(7));
    }

    public static boolean isPrime(int number){
       boolean isPrime = true;

       for (int i = 2; i<= (number / 2); i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
       }

       return isPrime;
    }

    public static boolean isPrimeStreams(int number){
        return IntStream.rangeClosed(2, (number/2)).noneMatch(i -> (number%i) == 0);
    }
}
