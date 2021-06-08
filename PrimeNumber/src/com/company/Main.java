package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 0; i < 99; i++ ){
            if(isPrime(i) == true){
                System.out.println("Prime Number: " + i);
                count++;
                if(count == 10){
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){

        if(n==1 || n==0){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
}
