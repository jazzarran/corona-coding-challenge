package com.jazzcorp;

public class PrimeNumberDetector {

    public static void main(String[] args) {
        System.out.println("661 is prime: " + isPrime(661));
        System.out.println("3 is prime: " + isPrime(3));
        System.out.println("21 is prime: " + isPrime(21));
        System.out.println("7 is prime: " + isPrime(7));
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
}
