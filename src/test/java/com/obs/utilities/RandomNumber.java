package com.obs.utilities;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    
    public static long getRandomNumber() {
        // Generating a random number between 1000000 and 9999999 (7-digit)
        long number = ThreadLocalRandom.current().nextLong(1000000, 10000000);
        return number;
    }
   

   
    public static void main(String[] args) {
        System.out.println("Random Number: " + getRandomNumber());
    }  
}

